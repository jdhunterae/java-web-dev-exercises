package org.launchcode.java.exercises;

public abstract class AbstractEntity {
    private static long deviceId = 0;
    protected long id;

    public AbstractEntity() {
        initDeviceId();
    }

    private void initDeviceId() {
        this.id = deviceId++;
    }

    public String toString() {
        return String.format("%s (%d)", getClass().getSimpleName(), id);
    }
}
