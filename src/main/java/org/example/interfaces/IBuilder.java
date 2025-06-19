package org.example.interfaces;

import org.example.builder.ExplosionBuilder;
import org.example.builder.ExplosionConfig;

import java.awt.*;

public interface IBuilder {
    ExplosionBuilder setPosition(int x, int y);
    ExplosionBuilder setColor(Color color);
    ExplosionBuilder setCount(int n);
    ExplosionBuilder setSpread(float spread);
    ExplosionBuilder setLifetime(float lifetime);
    ExplosionConfig build();
}
