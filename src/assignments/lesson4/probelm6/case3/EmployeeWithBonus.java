package assignments.lesson4.probelm6.case3;

public final class EmployeeWithBonus{
    private Employee e;
    private double bonus;

    EmployeeWithBonus(String name, int age, double bonus) {
        e = new Employee(name, age);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    //Can use either same classes or instanceof strategy here
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        EmployeeWithBonus ewb = (EmployeeWithBonus) ob;
        return ewb.e.equals(e) && ewb.bonus == this.getBonus();
    }
}
