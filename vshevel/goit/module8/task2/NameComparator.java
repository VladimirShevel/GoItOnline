package vshevel.goit.module6.task2;
import java.util.Comparator;

class NameComparator implements Comparator<Instrument> {

    @Override
    public int compare(Instrument e1, Instrument e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
