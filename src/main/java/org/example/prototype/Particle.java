package org.example.prototype;

import org.example.interfaces.IParticlePrototype;

public class Particle implements IParticlePrototype, Cloneable {
    private int posX;
    private int posY;
    private final ParticleFlyweight flyweight;

    public Particle(int posX, int posY, ParticleFlyweight flyweight) {
        this.posX = posX;
        this.posY = posY;
        this.flyweight = flyweight;
    }

    public Particle(ParticleFlyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public Particle clone() {
        try {
            return (Particle) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Particle(this.flyweight);
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void render(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println(
            "Particule " + flyweight.getType() +
            " rendue à la position (" + this.posX + ", " + this.posY +
            ") avec texture " + flyweight.getTexture() +
            " et shader " + flyweight.getShader()
        );
    }
}