package org.example.builder;


import java.awt.*;


public class ExplosionBuilder implements Builder {
    private int x;
    private int y;
    private Color color;
    private int count;
    private float spread;
    private float lifetime;

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setCount(int n) {
        this.count = n;
    }

    @Override
    public void setSpread(float spread) {
        this.spread = spread;
    }

    @Override
    public void setLifetime(float lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public ExplosionConfig build() {
        return new ExplosionConfig(x,y,color,count,spread,lifetime);
    }
}

