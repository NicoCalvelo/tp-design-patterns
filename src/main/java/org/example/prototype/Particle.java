package org.example.prototype;

import org.example.interfaces.IParticlePrototype;

public class Particle implements IParticlePrototype, Cloneable {
    private int posX;
    private int posY;
    private final ParticleFlyweight flyweight;

    public Particle(ParticleFlyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public Particle clone() {
        try {
            return (Particle) super.clone();
        } catch (CloneNotSupportedException e) {
            // Fallback in case clone is not supported
            return new Particle(this.flyweight);
        }
    }

    // Méthode factice d'affichage
    public void render(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println(
            "Particule " + flyweight.getType() +
            " rendue à la position (" + x + ", " + y + 
            ") avec texture " + flyweight.getTexture() +
            " et shader " + flyweight.getShader()
        );
    }
}