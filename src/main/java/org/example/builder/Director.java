package org.example.builder;

import org.example.interfaces.IBuilder;

import java.awt.*;

public class Director {
    public void triggerExplosion(IBuilder builder) {
        builder.setPosition(0,0);
        builder.setLifetime(5);
        builder.setSpread(5);
        builder.setCount(10);
        builder.setColor(Color.red);
    }
}
