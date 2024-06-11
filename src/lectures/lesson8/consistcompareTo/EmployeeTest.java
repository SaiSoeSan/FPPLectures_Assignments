package lectures.lesson8.consistcompareTo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom","Bruce", LocalDate.of(2014,12,12));
        Employee e2 = new Employee("Renuka","Mohanraj", LocalDate.of(2014,5,1));
        Employee e3 = new Employee("Tom","Daniel", LocalDate.of(2020,11,11));
        Employee e4 = new Employee("Tom","Bruce", LocalDate.of(2016,10,10));
        Employee e5 = new Employee("Anne","Dow", LocalDate.of(2014,12,12));

        // Employee Array List
        List<Employee> elist = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));

        //sort by Employee's Firt Name
        Collections.sort(elist, new EmployeeFirstnameCom());
        elist.forEach(x -> System.out.println(x.getFname()));
        System.out.println("Sort by first name List " + elist);


        Employee e11 = new Employee("Tom","Bruce", LocalDate.of(2024,12,12));
        Employee e12 = new Employee("Tom","Lester",LocalDate.of(2024,12,20));
        Employee e13 = new Employee("Tom","Bruce",LocalDate.of(2024,12,12));


        boolean res = e11.equals(e12);
        System.out.println("e11.equals(e12) = " + res);

        //Call Employee Comparator to test e11 and e12 for equlity
        EmployeeFirstnameCom ep = new EmployeeFirstnameCom();
        int com = ep.compare(e11,e12);  // false
        System.out.println("ep.compare(e11, e12) = " + com );  // true


        //ConsistWith Equals
        EmployeeComparator ec = new EmployeeComparator();
        boolean result = e11.equals(e12);
        System.out.println("e11.equals(e12) = " + result);

        int result2 = ec.compare(e11,e12);
        System.out.println("ec.compare(e11, e12) = " + result2 );

        //comparing e11 and e13
        EmployeeComparator ec1 = new EmployeeComparator();
        boolean result3 = e11.equals(e13);
        System.out.println("e11.equals(e12) = " + result3);

        int result4 = ec1.compare(e11,e13);
        System.out.println("ec1.compare(e11, e13) = " + result4 );  // true
    }
}
