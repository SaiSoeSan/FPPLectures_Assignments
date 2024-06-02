package assignments.lesson4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeptEmployee {
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    // constructor
    DeptEmployee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year,month,day);
    }

    public double computeSalary() {
        return this.salary;
    }

    // instance methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        final String DATE_PATTERN = "MM/dd/yyyy";

        return hireDate.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
