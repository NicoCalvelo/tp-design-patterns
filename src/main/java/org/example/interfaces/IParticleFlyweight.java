package org.example.interfaces;

public interface IParticleFlyweight {
    String getType();

    String getTexture();

    String getShader();

    IParticleFlyweight clone();
}