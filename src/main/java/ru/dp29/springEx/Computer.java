package ru.dp29.springEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Computer {
    private int id;
    private MusicPlayer musicPlayer;



    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer id: " + id + ", " + musicPlayer.playMusic();
    }
}
