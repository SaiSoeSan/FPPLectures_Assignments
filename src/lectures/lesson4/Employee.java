package lectures.lesson4;

import java.time.LocalDate;

public class Employee {
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDate(){
        return this.hireDate;
    }

    public void raiseSalary(double percent){
        double raise = this.salary * percent / 100;
        this.salary += raise;
    }



}
