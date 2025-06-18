package org.example.builder;

import java.awt.*;

public interface Builder {
    void setPosition(int x, int y);
    void setColor(Color color);
    void setCount(int n);
    void setSpread(float spread);
    void setLifetime(float lifetime);
    ExplosionConfig build();
}
