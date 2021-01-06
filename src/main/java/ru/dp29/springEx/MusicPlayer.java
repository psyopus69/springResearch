package ru.dp29.springEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenres genres) {
        switch(genres.getName()) {
            case "CLASSICAL": {
                return "Playing: " +getRandomSong(classicalMusic.getSongs());
            }
            case "ROCK": {
                return "Playing: " + getRandomSong(rockMusic.getSongs());
            }
            default: {
                return "random song for genre " + genres.getName() + " not FOUND!";
            }
        }
    }

    private String getRandomSong(ArrayList<String> songs) {
//        return songs.get((int)(songs.size() - songs.size() * Math.random()));
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
