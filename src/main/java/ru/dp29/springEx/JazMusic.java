package ru.dp29.springEx;

import java.util.ArrayList;
import java.util.Arrays;

public class JazMusic implements Music{
    @Override
    public ArrayList<String> getSongs() {
        return new ArrayList<>(Arrays.asList("Ray Jones", "someBlues Author"));
    }
}
