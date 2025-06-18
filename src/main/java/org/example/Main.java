package org.example;

import org.example.builder.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Crée un builder
        Builder builder = new ExplosionBuilder();

        // Crée un director et configure une explosion
        Director director = new Director();
        director.triggerExplosion(builder);

        // Construit la configuration
        ExplosionConfig config = builder.build();

        Explosion explosion = new Explosion(config);
        explosion.trigger();

    }
}