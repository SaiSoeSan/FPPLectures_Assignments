package lectures.lesson5;

public class OrderOfClass {
    //static fields // block only one time run
    static int superInt = superIntMethod();
    static int superIntMethod() {
        System.out.println("1 Initializing static fields");
        return 1;
    }

    //static block
    static{
        System.out.println("2 Executing static block");
    }

    //instance block // common to constructor
    private int superInstanceInt=superInstanceIntMethod();
    int superInstanceIntMethod() {
        System.out.println("5-Initialzing superInstanceInt");
        return 3;
    }

    // Constructor
    OrderOfClass(){
        System.out.println("7-Running Order of class constructor");
    }

    //instance block
    {
        System.out.println("6-Running super object initialization block");
    }

    public static void main(String[] args) {
        new SubClass();
    }
}


class SubClass extends OrderOfClass{
    //static
    static int subInt = subIntMethod();
    static int subIntMethod(){
        System.out.println("3-Initializing static sub int");
        return 2;
    }
    static {
        System.out.println("4-Executing sub static block");
    }

    // Instancce fields
    int subInstanceIntMethod() {
        System.out.println("9-Initialzing subInstanceInt");
        return 3;
    }

    // Subclass Constrctor
    SubClass(){
        System.out.println("10-Running SubClass constructor");
    }

    //Sub class instance block initialization block
    {
        System.out.println("8-Running sub object initialization block");
    }

    private int subInstanceInt = subInstanceIntMethod();
}

