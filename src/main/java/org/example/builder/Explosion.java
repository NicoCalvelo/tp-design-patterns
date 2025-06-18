package org.example.builder;

public class Explosion {
    private final ExplosionConfig config;

    public Explosion(ExplosionConfig config) {
        this.config = config;
    }

    public void trigger() {
        System.out.println("💥 Explosion déclenchée !");
        System.out.println("Position : (" + config.getX() + ", " + config.getY() + ")");
        System.out.println("Couleur : " + config.getColor());
        System.out.println("Particules : " + config.getCount());
        System.out.println("Écart : " + config.getSpread());
        System.out.println("Durée : " + config.getLifetime() + "s");
    }
}
