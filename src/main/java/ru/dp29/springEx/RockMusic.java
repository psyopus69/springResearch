package ru.dp29.springEx;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Beastie Boys";
    }
}
