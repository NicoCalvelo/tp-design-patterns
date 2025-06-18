package org.example.prototype;

import org.example.interfaces.IParticleFlyweight;

public class ParticleFlyweight implements IParticleFlyweight, Cloneable {
    private String type;
    private String texture;
    private String shader;

    public ParticleFlyweight(String type, String texture, String shader) {
        this.type = type;
        this.texture = texture;
        this.shader = shader;
    }

    // Méthode factice d'affichage
    @Override
    public void render(int x, int y) {
        System.out.println("Particule " + type + " rendue à la position (" + x + ", " + y + ") avec la texture " + texture + " et le shader " + shader + ".");
    }

    @Override
    public ParticleFlyweight clone() {
        try {
            return (ParticleFlyweight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erreur lors du clonage du ParticleFlyweight", e);
        }
    }
}