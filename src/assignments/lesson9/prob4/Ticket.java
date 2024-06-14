package assignments.lesson9.prob4;

import java.util.Random;

public class Ticket {
    private int id;
    private String description;

    public Ticket(String description){
        this.description = description;
        this.id = generateId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int generateId(){
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
