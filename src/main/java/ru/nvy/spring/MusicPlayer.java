package ru.nvy.spring;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author NVY
 */
public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    Music music;
    private String name;
    private int volume;

    /**
     * Constructor Without param
     */
    public MusicPlayer() {
    }

    // IoC via Constructor (Dependency Injection)

    /**
     * Constructor MusicPlayer
     *
     * @param music
     */
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // region Get

    /**
     * String name
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * int Volume
     *
     * @return int Volume
     */
    public int getVolume() {
        return volume;
    }
    // endregion

    //region Set IoC via Setter (Dependency Injection)

    /**
     * Set Music List
     *
     * @param musicList
     */
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    /**
     * Set Name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set volume
     *
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }
    //endregion

    /**
     * Метод реализующий вывод музыкальных композиций, которые играют в данный момент
     */
    public void playMusic() {
        System.out.println("Via constructor Playing: " + music.getSong());
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
