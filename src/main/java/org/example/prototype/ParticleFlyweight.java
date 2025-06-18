package org.example.prototype;

import org.example.interfaces.IParticleFlyweight;

public class ParticleFlyweight implements IParticleFlyweight, Cloneable {
    private final String type;
    private final String texture;
    private final String shader;

    public ParticleFlyweight(String type, String texture, String shader) {
        this.type = type;
        this.texture = texture;
        this.shader = shader;
    }

    public String getType() {
        return type;
    }

    public String getTexture() {
        return texture;
    }

    public String getShader() {
        return shader;
    }

    @Override
    public ParticleFlyweight clone() {
        try {
            return (ParticleFlyweight) super.clone();
        } catch (CloneNotSupportedException e) {
            // Fallback in case clone is not supported
            return new ParticleFlyweight(this.type, this.texture, this.shader);
        }
    }
}