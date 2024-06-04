package assignments.lesson4.probelm6.case1;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("John",20);
        Employee e2 = new Employee("John",20);
        Employee e3 = new Employee("David",30);
        System.out.println("e1.equals(e2) : " + e1.equals(e2)); 						// true
        System.out.println("e2.equals(e3) : " + e2.equals(e3)); 							//false

        EmployeeWithBonus eb1 = new EmployeeWithBonus("John",20,5000);
        EmployeeWithBonus eb2 = new EmployeeWithBonus("John",40,4000);
        System.out.println("e1.equals(eb1) : " + e1.equals(eb1)); 		  // true						//true
        System.out.println("e1.equals(eb2) : " + e1.equals(eb2)); 		  // false					//true
        System.out.println(eb1 instanceof Employee); //true
    }
}
