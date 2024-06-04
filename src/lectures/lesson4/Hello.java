package lectures.lesson4;

public class Hello {
    public static void main(String[] args) {
        System.out.println("update hello");
        Manager boss = new Manager("Boss",3000,2020,5,5);
        boss.setBonus(3000);
        boss.raiseSalary(2);

        Employee[] staff = new Employee[2];
        staff[0] = boss;
        staff[1] = new Manager("Sai",45054,2023,6,2);
        for(Employee e : staff) {
            System.out.println( "name: " + e.getName() +
                    "salary: " + e.getSalary());
        }
    }
}
