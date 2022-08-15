package org.launchcode.java.exercises;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int storage, int ram, double weight) {
        super(storage, ram, true);
        this.weight = weight;
    }

    public boolean isClunky() {
        return weight > 5.0;
    }

    public String toString() {
        return String.format("%s (#%d) [storage=%d, ram=%d, keyboard=attached]",
                this.getClass().getSimpleName(), id, storage, ram);
    }
}
