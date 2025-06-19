package org.example;

import org.example.builder.*;
import org.example.proxy.ExplosionCacheProxy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Crée un builder
        Builder builder = new ExplosionBuilder();

        // Crée un director et configure une explosion
        Director director = new Director();
        director.triggerExplosion(builder);

        ExplosionConfig config = builder.build();

        Explosion explosion = ExplosionCacheProxy.createExplosion(config, "air");
        explosion.trigger();

        builder.setPosition(100, 50);
        builder.setLifetime(2);
        builder.setSpread(10);
        builder.setCount(5);
        builder.setColor(java.awt.Color.BLUE);

        ExplosionConfig config2 = builder.build();
        Explosion explosion2 = ExplosionCacheProxy.createExplosion(config2, "fire");
        explosion2.trigger();

    }
}