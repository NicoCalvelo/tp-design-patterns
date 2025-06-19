package org.example.builder;

import java.util.List;
import org.example.prototype.Particle;

public class Explosion {
    private final ExplosionConfig config;
    private final List<Particle> particles;

    public Explosion(ExplosionConfig config, List<Particle> particles) {
        this.config = config;
        this.particles = particles;
    }

    public void trigger() {
        System.out.println("\uD83D\uDCA5 Explosion déclenchée !");
        System.out.println("Position : (" + config.getX() + ", " + config.getY() + ")");
        System.out.println("Couleur : " + config.getColor());
        System.out.println("Particules : " + config.getCount());
        System.out.println("Écart : " + config.getSpread());
        System.out.println("Durée : " + config.getLifetime() + "s");
        for (Particle p : particles) {
            p.render(p.getPosX(), p.getPosY());
        }
    }
}

