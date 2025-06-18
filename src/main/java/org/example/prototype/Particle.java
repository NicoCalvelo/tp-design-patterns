package org.example.prototype;

import org.example.interfaces.IParticlePrototype;

public class Particle implements IParticlePrototype {
    private int posX;
    private int posY;
    private ParticleFlyweight flyweight;

    public Particle(int posX, int posY, ParticleFlyweight flyweight) {
        this.posX = posX;
        this.posY = posY;
        this.flyweight = flyweight;
    }

    @Override
    public IParticlePrototype clone() {
        return new Particle(this.posX, this.posY, this.flyweight);
    }
}