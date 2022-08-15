package org.launchcode.java.exercises;

public class Computer extends AbstractEntity {
    protected int ram;
    protected int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        super();
        this.storage = storage;
        this.ram = ram;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRam(int ram) {
        this.ram += ram;
    }

    public void increaseStorage(int storage) {
        this.storage += storage;
    }

    public void attachKeyboard() {
        hasKeyboard = false;
    }

    public void removeKeyboard() {
        hasKeyboard = false;
    }

    public String toString() {
        return String.format("%s (#%d) [storage=%d, ram=%d, keyboard=%s]",
                this.getClass().getSimpleName(), id, storage, ram, hasKeyboard);
    }
}
