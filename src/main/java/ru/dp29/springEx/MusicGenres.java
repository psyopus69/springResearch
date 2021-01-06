package ru.dp29.springEx;

public enum MusicGenres {
    CLASSICAL("CLASSICAL"),
    ROCK("ROCK");

    private String name;
    MusicGenres(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
