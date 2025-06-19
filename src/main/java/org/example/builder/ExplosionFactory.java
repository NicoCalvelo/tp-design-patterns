package org.example.builder;

import org.example.prototype.Particle;
import org.example.prototype.ParticleFlyweight;
import org.example.singleton.ParticleFlyweightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExplosionFactory {
    public static Explosion createExplosion(ExplosionConfig config, String particleType) {
        ParticleFlyweight flyweight = ParticleFlyweightFactory.getInstance().getFlyweight(particleType);
        List<Particle> particles = new ArrayList<>();
        Random random = new Random();
        int count = config.getCount();
        float spread = config.getSpread();
        int baseX = config.getX();
        int baseY = config.getY();
        for (int i = 0; i < count; i++) {
            int dx = (int) ((random.nextFloat() - 0.5f) * 2 * spread);
            int dy = (int) ((random.nextFloat() - 0.5f) * 2 * spread);
            Particle p = new Particle(flyweight);
            p.render(baseX + dx, baseY + dy);
            particles.add(p);
        }
        return new Explosion(config, particles);
    }
}
