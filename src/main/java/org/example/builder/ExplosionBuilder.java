package org.example.builder;


import org.example.interfaces.IBuilder;

import java.awt.*;


public class ExplosionBuilder implements IBuilder {
    private int x;
    private int y;
    private Color color;
    private int count;
    private float spread;
    private float lifetime;

    @Override
    public ExplosionBuilder setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public ExplosionBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public ExplosionBuilder setCount(int n) {
        this.count = n;
        return this;
    }

    @Override
    public ExplosionBuilder setSpread(float spread) {
        this.spread = spread;
        return this;
    }

    @Override
    public ExplosionBuilder setLifetime(float lifetime) {
        this.lifetime = lifetime;
        return this;
    }

    @Override
    public ExplosionConfig build() {
        return new ExplosionConfig(x,y,color,count,spread,lifetime);
    }
}

