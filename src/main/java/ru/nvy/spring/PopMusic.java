package ru.nvy.spring;

import org.springframework.stereotype.Component;

/**
 * @author NVY
 */
@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Sacrifice";
    }
}
