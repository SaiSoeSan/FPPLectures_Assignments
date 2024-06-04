package assignments.lesson4.probelm6.case2;

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

    // Equals GetClass Strategy
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(ob.getClass() != this.getClass()) return false;
        Employee e = (Employee) ob;
        return e.name.equals(name) && e.age == age;
    }
}
