package ru.dp29.springEx;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }
    @Override
    public String getSong() {
        ArrayList<String> songs = new ArrayList<>();
        return "Biggie Smalls";
    }
}
