package assignments.lesson6.taskA;

import java.util.Comparator;

public class NameComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee d1, DeptEmployee d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
