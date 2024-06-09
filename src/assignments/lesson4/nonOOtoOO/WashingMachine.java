package assignments.lesson4.nonOOtoOO;

public class WashingMachine implements Machine  {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
}
