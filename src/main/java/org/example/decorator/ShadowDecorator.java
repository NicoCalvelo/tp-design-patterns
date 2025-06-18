package org.example.decorator;

public class ShadowDecorator extends ParticleDecorator {
    public ShadowDecorator(IParticleDecorator particle) {
        super(particle);
    }

    @Override
    public void render(int posX, int posY) {
        // Render the base particle
        particle.render(posX, posY);

        // Add Shadow effect
        System.out.println("Adding Shadow effect at position (" + posX + ", " + posY + ")");
    }
}