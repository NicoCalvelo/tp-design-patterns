package org.example.proxy;

import org.example.builder.Explosion;
import org.example.builder.ExplosionConfig;
import org.example.builder.ExplosionFactory;
import org.example.interfaces.IExplosionFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExplosionCacheProxy implements IExplosionFactory {
    private static final Map<String, Explosion> cache = new HashMap<>();

    public static Explosion createExplosion(ExplosionConfig config, String particleType) {
        String key = getCacheKey(config, particleType);

        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        Explosion explosion = ExplosionFactory.createExplosion(config, particleType);

        cache.put(key, explosion);
        return explosion;
    }

    private static String getCacheKey(ExplosionConfig config, String particleType) {
        return Integer.toHexString(Objects.hash(
            particleType,
            config.getX(),
            config.getY(),
            config.getCount(),
            config.getSpread()
        ));
    }
}