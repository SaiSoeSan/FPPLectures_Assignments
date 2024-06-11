package lectures.lesson8.consistcompareTo;

import java.util.Comparator;

//sort by employee first name
public class EmployeeFirstnameCom implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
