package org.example.interfaces;

import org.example.builder.Explosion;
import org.example.builder.ExplosionConfig;

public interface IExplosionFactory {
    static Explosion createExplosion(ExplosionConfig config, String particleType) {
        throw new UnsupportedOperationException("Not implemented");
    };
}