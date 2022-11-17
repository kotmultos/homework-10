package org.example;

import java.awt.*;

public class Cat extends Predator{
    private String breed;

    public Cat(double weight, Color color, String breed) {
        super(weight, color);
        this.breed = breed;
    }


    public String sleep() {
        return "sleep";
    }

    public String eat() {
        return "eat";
    }

    public String tigidik() {
        return "tigidik";
    }

    public String lick() {
        return "lick";
    }

    public String getActivity(DaysOfWeek day) {
         String res = switch (day) {
             case MON, WED, FRI -> sleep();
             case TUE, THU, SUN -> eat();
             case SAT -> tigidik();
             default -> lick();
         };
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return breed.equals(cat.breed) && color.equals(cat.color) && weight == cat.weight;
    }

    @Override
    public int hashCode() {
        int result = breed == null ? 0 : breed.hashCode();
        result = 31 * result + (int)weight;
        result = 31 * result + color.getRGB();
        return result;
    }
}
