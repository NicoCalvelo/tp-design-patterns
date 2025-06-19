package org.example;

import org.example.builder.*;
import org.example.interfaces.IBuilder;
import org.example.proxy.ExplosionCacheProxy;

public class Main {
    public static void main(String[] args) {

        IBuilder builder = new ExplosionBuilder();

        ExplosionConfig config = builder.setPosition(10,10)
                .setLifetime(5)
                .setColor(java.awt.Color.RED)
                .setSpread(20)
                .setCount(6)
                .build();

        Explosion explosion = ExplosionCacheProxy.createExplosion(config, "air");
        explosion.trigger();


        ExplosionConfig config2 = builder.setPosition(10,10)
                .setLifetime(5)
                .setColor(java.awt.Color.RED)
                .setSpread(20)
                .setCount(6)
                .build();


        Explosion explosion2 = ExplosionCacheProxy.createExplosion(config2, "fire");
        explosion2.trigger();

    }
}