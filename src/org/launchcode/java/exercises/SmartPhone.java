package org.launchcode.java.exercises;

public class SmartPhone extends Computer {
    private int selfies;

    public SmartPhone(int storage, int ram, int selfies) {
        super(storage, ram, true);
        this.selfies = selfies;
    }

    public void takeSelfie() {
        this.selfies += 1;
    }

    public int getSelfies() {
        return selfies;
    }

    public String toString() {
        String text = super.toString();
        return String.format("%s (#%d) [storage=%d, ram=%d, keyboard=virtual, selfies=%d]",
                this.getClass().getSimpleName(), id, storage, ram, selfies);
    }
}
