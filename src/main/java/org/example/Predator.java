package org.example;

import java.awt.*;

public abstract class Predator {
    protected double weight;
    protected Color color;

    public Predator(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public abstract String sleep();
    public abstract String eat();

}
