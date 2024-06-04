package assignments.lesson4.probelm6.case1;

public final class EmployeeWithBonus extends Employee {
    private double bonus;

    EmployeeWithBonus(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }
}
