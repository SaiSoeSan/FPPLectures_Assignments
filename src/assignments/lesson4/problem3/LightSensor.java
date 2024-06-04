package assignments.lesson4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private String location;
    private String lastUpdated;

    private double lightLevel;

    private final String sensorType = "Light";

    public LightSensor(String location, int lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
    }

    @Override
    public String toString(){
        String result = String.format("Sensor Type : "+ this.getSensorType() + "\n");
        result += "Reading:" + this.lightLevel + "\n";
        result += "Location : " + this.location + "\n";
        result += "Last Updated:" + this.lastUpdated + "\n";
        return result;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = DateTimeFormatter.ofPattern("hh:mm a").format(LocalDateTime.now());
        return lastUpdated;
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
    public String performAction() {
        if(this.lightLevel < 100){
            return "An alert to turn on the light";
        }else{
            return  "Light is sufficient";
        }
    }
}
