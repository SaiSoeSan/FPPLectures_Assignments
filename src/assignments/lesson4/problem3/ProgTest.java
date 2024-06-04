package assignments.lesson4.problem3;

public class ProgTest {
    public static void main(String[] args) {
        Temparature t1 = new Temparature("Living Room",200);
        LightSensor l1 = new LightSensor("Garden",80);
        SoundSensor s1 = new SoundSensor("Bedroom",65.0);

        Sensor[] sensors = {
                t1,l1,s1
        };
        for(Sensor s : sensors){
            s.getLastUpdated();
            System.out.println(s);
        }
    }
}
