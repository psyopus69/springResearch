package ru.dp29.springEx;

import org.springframework.stereotype.Component;

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
    public String getSong() {
        return "Biggie Smalls";
    }
}
