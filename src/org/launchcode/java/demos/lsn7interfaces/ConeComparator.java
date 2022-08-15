package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        double diff = o1.getCost() - o2.getCost();

        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        }

        return 0;
    }
}
