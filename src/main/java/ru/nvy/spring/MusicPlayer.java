package ru.nvy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author NVY
 */
@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music popMusic;

    /**
     * Constructor MusicPlayer
     * IoC via Constructor (Dependency Injection)
     *
     * @param rockMusic
     * @param popMusic
     */
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("popMusic") Music popMusic) {
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    /**
     * A method that implements the return of musical compositions that are currently playing
     */
    public String playMusic() {
        return "Playing: " + rockMusic.getSong() + " and " + popMusic.getSong();
    }
}
