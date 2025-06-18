package org.example.decorator;

import org.example.interfaces.IParticlePrototype;

public class GlowDecorator extends ParticleDecorator {
    public GlowDecorator(IParticlePrototype particle) {
        super(particle);
    }

    @Override
    public void render(int posX, int posY) {
        // Render the base particle
        particle.render(posX, posY);

        // Add glow effect
        System.out.println("Adding glow effect at position (" + posX + ", " + posY + ")");
    }
}