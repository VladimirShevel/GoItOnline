package vshevel.goit.module6.task2;

import java.util.Comparator;

class ProductCodeComparator implements Comparator<Instrument> {
    @Override
    public int compare(Instrument o1, Instrument o2) {
        if (o1.getProductCode() > o2.getProductCode()) {
            return 1;
        } else {
            return -1;
        }
    }
}
