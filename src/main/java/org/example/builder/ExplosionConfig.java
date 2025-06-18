package org.example.builder;

import java.awt.*;

public class ExplosionConfig {
    private final int x;
    private final int y;
    private final Color color;
    private final int count;
    private final float spread;
    private final float lifetime;

    public ExplosionConfig(int x, int y, Color color, int count, float spread, float lifetime) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.count = count;
        this.spread = spread;
        this.lifetime = lifetime;
    }

    public float getLifetime() {
        return lifetime;
    }

    public float getSpread() {
        return spread;
    }

    public int getCount() {
        return count;
    }

    public Color getColor() {
        return color;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
