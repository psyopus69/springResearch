package ru.dp29.springEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        RockMusic classicalMusic = context.getBean("musicBean", RockMusic.class);
//        ClassicalMusic cm = ClassicalMusic.getClassicalMusic();
//        System.out.println(cm.getSong());
//        System.out.println(classicalMusic.getSong());
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer mp2 = new MusicPlayer(music2);
        mp2.playMusic();
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println("comparison: " + comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);

//        firstMusicPlayer.setVolume(111);
//        firstMusicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
