package assignments.lesson4.nonOOtoOO;

public class ApplianceTest {
    public static void main(String[] args) {
        Machine[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };

        for(Machine m : appliances){
            System.out.println(m.getClass().getSimpleName());
            m.performFunction();
        }
    }
}
