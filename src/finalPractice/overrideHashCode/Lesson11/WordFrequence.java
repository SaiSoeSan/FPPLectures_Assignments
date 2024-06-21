package finalPractice.overrideHashCode.Lesson11;

import java.util.HashMap;

public class WordFrequence {
    public static void main(String[] args) {
       String s = "Hello Sai Soe San Happy Hello Sai";
       String[] words = s.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words){
            int count = map.getOrDefault(word,0);
            map.put(word,++count);
        }

        for(String i : map.keySet()){
            System.out.println(i+ " : " + map.get(i));
        }
    }
}
