package ru.dp29.springEx;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Biggie Smalls";
    }
}
