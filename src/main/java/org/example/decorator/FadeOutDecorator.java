package org.example.decorator;

import org.example.interfaces.IParticleDecorator;

public class FadeOutDecorator extends ParticleDecorator {
    public FadeOutDecorator(IParticleDecorator particle) {
        super(particle);
    }

    @Override
    public void render(int posX, int posY) {
        // Render the base particle
        particle.render(posX, posY);

        // Add FadeOut effect
        System.out.println("Adding FadeOut effect at position (" + posX + ", " + posY + ")");
    }
}