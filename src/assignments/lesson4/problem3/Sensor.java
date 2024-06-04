package assignments.lesson4.problem3;

public interface Sensor {
    String getSensorType();
    double getReading();

    String getLocation();

    String getLastUpdated();

    String toString();


    public String performAction();

}
