package assignments.lesson4.problem4;

public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee(String firstName, String lastName,
                                       String socialSecurityNumber, double baseSalary, double grossSales,
                                       double commisionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return this.getBaseSalary() + super.getPayment();
    }
}
