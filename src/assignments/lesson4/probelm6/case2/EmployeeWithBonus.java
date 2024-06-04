package assignments.lesson4.probelm6.case2;

public final class EmployeeWithBonus extends Employee {
    private double bonus;

    EmployeeWithBonus(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    // Equals GetClass Strategy
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(ob.getClass() != this.getClass()) return false;
        EmployeeWithBonus e = (EmployeeWithBonus) ob;
        return e.getName().equals(this.getName()) && e.getAge() == this.getAge() &&
                e.getBonus() == this.getBonus();
    }
}
