package ru.nvy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NVY
 */
public class TestSpring {
    public static void main(String[] args) {
        // обращение к конфигурационному файлу
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // checking the scope of the bean
        firstMusicPlayer.setVolume(10);
        System.out.println("--------- First Music Player ----------");
        firstMusicPlayer.playMusic();
        System.out.println("Name: " + firstMusicPlayer.getName() + " Volume: " + firstMusicPlayer.getVolume());
        System.out.println("--------- Second Music Player ---------");
        secondMusicPlayer.playMusic();
        System.out.println("Name: " + secondMusicPlayer.getName() + " Volume: " + secondMusicPlayer.getVolume());
        context.close();
    }
}
