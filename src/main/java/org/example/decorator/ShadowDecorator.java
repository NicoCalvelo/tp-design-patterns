package org.example.decorator;

import org.example.interfaces.IParticleDecorator;

public class ShadowDecorator extends ParticleDecorator {
    public ShadowDecorator(IParticleDecorator particle) {
        super(particle);
    }

    @Override
    public void render(int posX, int posY) {
        particle.render(posX, posY);

        System.out.println("Adding Shadow effect at position (" + posX + ", " + posY + ")");
    }
}