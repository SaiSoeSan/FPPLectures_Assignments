package assignments.lesson4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements  Sensor{
    private String location;
    private String lastUpdated;

    private double soundLevel;

    private final String sensorType = "Sound";

    public SoundSensor(String location,double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return this.sensorType;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = DateTimeFormatter.ofPattern("hh:mm a").format(LocalDateTime.now());
        return lastUpdated;
    }

    @Override
    public String toString(){
        String result = String.format("Sensor Type : "+ this.getSensorType() + "\n");
        result += "Reading:" + this.soundLevel + "\n";
        result += "Location : " + this.location + "\n";
        result += "Last Updated:" + this.lastUpdated + "\n";
        return result;
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
        if(this.soundLevel > 70){
            return "An alert to turn on noise cancellation";
        }else{
            return  "Sound is within normal range";
        }
    }
}
