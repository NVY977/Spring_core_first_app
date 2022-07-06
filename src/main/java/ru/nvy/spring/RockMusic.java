package ru.nvy.spring;

import org.springframework.stereotype.Component;

/**
 * @author NVY
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }
}
