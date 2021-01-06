package ru.dp29.springEx;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    @Override
    public ArrayList<String> getSongs() {
        ArrayList<String> songs = new ArrayList<>(3);
        songs.add("Offspring");
        songs.add("Papa Roach");
        songs.add("Beastie Boys");
        return songs;
    }
}
