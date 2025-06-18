package org.example.decorator;

import org.example.interfaces.IParticleDecorator;
import org.example.interfaces.IParticlePrototype;

public abstract class ParticleDecorator implements IParticleDecorator {
    protected IParticlePrototype particle;

    public ParticleDecorator(IParticlePrototype particle) {
        this.particle = particle;
    }

    @Override
    public IParticlePrototype clone() {
        return particle.clone();
    }
}