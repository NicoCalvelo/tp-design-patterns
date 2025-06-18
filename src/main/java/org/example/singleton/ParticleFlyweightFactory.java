package org.example.singleton;

import org.example.prototype.ParticleFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ParticleFlyweightFactory {
    private static ParticleFlyweightFactory instance = null;
    private Map<String, ParticleFlyweight> flyweights = new HashMap<>();

    private ParticleFlyweightFactory() {
        // Initialisation de quelques flyweights
        flyweights.put("fire", new ParticleFlyweight("fire", "fire_texture.png", "fire_shader"));
        flyweights.put("water", new ParticleFlyweight("water", "water_texture.png", "water_shader"));
        flyweights.put("earth", new ParticleFlyweight("earth", "earth_texture.png", "earth_shader"));
        flyweights.put("air", new ParticleFlyweight("air", "air_texture.png", "air_shader"));
    }

    public static ParticleFlyweightFactory getInstance() {
        if (instance == null) {
            instance = new ParticleFlyweightFactory();
        }
        return instance;
    }

    public ParticleFlyweight getFlyweight(String type) {
        if (!flyweights.containsKey(type)) {
            System.out.println("Création d'un nouveau type de particule : " + type + " (délai de 500ms)");
            try {
                // Ajouter un délai de 500ms lors de la création initiale
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Interruption pendant le délai de création : " + e.getMessage());
            }
            flyweights.put(type, new ParticleFlyweight(type, type + "_texture.png", type + "_shader"));
        }
        return flyweights.get(type).clone();
    }
}