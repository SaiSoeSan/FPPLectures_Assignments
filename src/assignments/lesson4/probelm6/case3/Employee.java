package assignments.lesson4.probelm6.case3;

public class Employee {
    private String name;

    private int age;
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //Can use instanceof or same classes strategy here since no inheritance
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(!(ob instanceof Employee e)) return false;
        return e.name.equals(this.getName()) && e.age == this.getAge();
    }

    public static void main(String[] args) {
        Employee p1 = new Employee("John",30);
        Employee p2 = new Employee("John",30);
        Employee p3 = new Employee("David",40);
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        System.out.println("p2.equals(p3) : " + p2.equals(p3));

    }
}
