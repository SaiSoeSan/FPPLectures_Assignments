package lectures.ListDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayBaseList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public ArrayBaseList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    //add element into last
    public void add(String item) {
        if (item == null) return;
        if (item.equals(null)) return;
        //if full
        if (size >= strArray.length) {
            resize();
        }
        strArray[size] = item;
        size++;
    }

    //insert with position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size) {
            return;
        }

        //if array get full
        if (size >= strArray.length) {
            resize();
        }

        //create temp array
        String[] temp = new String[strArray.length];
        for (int i = 0; i < pos; i++) {
            temp[i] = strArray[i];
        }
        temp[pos] = s;

        for (int i = pos + 1; i < strArray.length; i++) {
            temp[i] = strArray[i - 1];
        }

        strArray = temp;
        ++size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {  // before last element
            sb.append(strArray[i]).append(" ");
        }
        sb.append(strArray[size - 1] + "]");
        return sb.toString();
    }

    public boolean find(String s) {
        if (s == null) return false;
        for (String str : strArray) {
            if (str.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return strArray[index];
    }

    public boolean remove(String s) {
        //find index
        if (size == 0) return false;
        if (s == null) return false;
        int index = -1;
        for(int i = 0; i < size; i++){
            if(s.equals(strArray[i])){
                index = i;
            }
        }
        if (index == -1) return false;
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index, (size - index) - 1);
        strArray = temp;
        size--;
        return true;
    }


    public void resize() {
        int newLength = strArray.length * 2;
        strArray = Arrays.copyOf(strArray, newLength);
    }

    public void sort(){
        if(strArray == null || size <= 1) return;
        int temp = 0;
        for(int i = 0; i < size; i++){
            int nextMinPos = minPos(i,size-1);
            swap(i,nextMinPos);
        }
    }

    void swap(int i, int j){
        String temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;
    }

    public int minPos(int start, int end){
        String min = strArray[start];
        int index = start;
        for(int i = start+1; i <= end; i++){
            if(strArray[i].compareTo(min) < 0){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        Collections.sort(mylist);

//        ArrayBaseList l = new A;rrayBaseList();
//        l.add("Bob");
//        l.add("Steve");
//        l.add("Susan");
//        l.add("Mark");
//        l.remove("Susan");
//        l.sort();
//        System.out.println(l);
    }
}