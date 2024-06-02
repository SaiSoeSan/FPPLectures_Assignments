package assignments.lesson4;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        numberOfPublications = 0;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
