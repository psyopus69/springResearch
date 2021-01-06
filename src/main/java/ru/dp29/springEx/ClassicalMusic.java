package ru.dp29.springEx;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destroy");
    }
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Biggie Smalls");
        songs.add("2pac");
        songs.add("run DMC");
        return songs;
    }
}
