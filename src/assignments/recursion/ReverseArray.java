package assignments.recursion;


import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{43,5,3,6,2,6,1})));
    }

    public static int[] reverseArray(int[] a){
        if(a.length == 0) {
            return a;
        }else{
            return getReverseArray(a,0,a.length - 1);
        }
    }

    private static int[] getReverseArray(int[] a, int start, int end){
        if(start >= end) return a;
        else{
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            return getReverseArray(a,++start,--end);
        }
    }
}
