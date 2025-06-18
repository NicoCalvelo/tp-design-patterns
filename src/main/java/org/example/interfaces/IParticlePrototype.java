package org.example.interfaces;

public interface IParticlePrototype {

    IParticlePrototype clone();

    void render(int posX, int posY);
}