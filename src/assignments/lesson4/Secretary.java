package assignments.lesson4;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        overtimeHours = 0.00;
    }

    public void setOvertimeHours(double hour){
        this.overtimeHours = hour;
    }

    public double getOverTimeHours(){
        return this.overtimeHours;
    }

    @Override
    public double computeSalary() {
        // no direct access to private variables of superclass
        double baseSalary = super.computeSalary();
        return baseSalary + (12 * this.overtimeHours);
    }
}
