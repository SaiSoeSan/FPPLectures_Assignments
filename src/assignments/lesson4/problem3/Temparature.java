package assignments.lesson4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Temparature implements Sensor {
    private String location;
    private String lastUpdated;

    private double temperature;

    private final String sensorType = "Temperature";

    public Temparature(String location, int temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
    public String toString(){
//        Sensor Type: Temperature Reading: 23.5 Location: Living Room Last Updated: 03:55 PM Action: Temperature is within the normal range.
        String result = String.format("Sensor Type : "+ this.getSensorType() + "\n");
        result += "Reading:" + this.temperature + "\n";
        result += "Location : " + this.location + "\n";
        result += "Last Updated:" + this.lastUpdated + "\n";
        return result;
    }

    @Override
    public String getSensorType() {
        return this.sensorType;
    }

    @Override
    public double getReading() {
        return 0;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = DateTimeFormatter.ofPattern("hh:mm a").format(LocalDateTime.now());
        return lastUpdated;
    }

    @Override
    public String performAction() {
        return this.temperature > 30 ? "An alert to turn on the AC" : temperature < 18 ?
                "An alert to turn on the Heater" : "Temperature is in normal range";

    }
}
