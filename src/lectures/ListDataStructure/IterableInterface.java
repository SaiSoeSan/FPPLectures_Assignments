package lectures.ListDataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {
    public static void main(String[] args) {
        //for loop
        List<String> myList = new ArrayList<>();
        myList.add("Sai");
        myList.add("Soe");
        myList.add("San");

        //for loop advance
        for(String s : myList){
            System.out.println(s);
        }

        //foreach , lambada
        myList.forEach((element)->{
            System.out.println(element);
        });

        //itertor
        //cos List and ArrayList are Iterable interface
        Iterator<String> myiterator = myList.iterator();
        while(myiterator.hasNext()){
            String element = myiterator.next();
        }
    }
}
