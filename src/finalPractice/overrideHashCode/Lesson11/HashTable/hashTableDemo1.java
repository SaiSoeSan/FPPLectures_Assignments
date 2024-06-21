package finalPractice.overrideHashCode.Lesson11.HashTable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class hashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<String,Course> table = new Hashtable<>();

        table.put("CS390", new Course("CS390","FPP"));
        table.put("CS401", new Course("CS401","MPP"));
        table.put("CS472", new Course("CS472","Algorithms"));
        table.put("CS475", new Course("CS475","Android"));
        table.put("CS572", new Course("CS572","Advanced Algorithms"));


        //loop throught
        table.forEach((key,value) -> {
            if(value.getCname().startsWith("A")){
                System.out.println(value.getCname());
            }
        });

        System.out.println(getCName(table,"A"));
    }

    public static List<String> getCName(Hashtable<String,Course> table, String sw){
        List<String> ls = new ArrayList<>();
        table.forEach((key,value) -> {
            if(value.getCname().startsWith(sw)){
                ls.add(value.getCname());
            }
        });
        return ls;
    }
}
