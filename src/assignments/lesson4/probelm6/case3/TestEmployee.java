package assignments.lesson4.probelm6.case3;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeWithBonus eb1 = new EmployeeWithBonus("John",30,5000);
        EmployeeWithBonus eb2 = new EmployeeWithBonus("John",30,5000);
        EmployeeWithBonus eb3 = new EmployeeWithBonus("John",40,6000);
        System.out.println("eb1.equals(eb2) : " + eb1.equals(eb2));
        System.out.println("eb2.equals(eb3) : " + eb2.equals(eb3));
    }
}
