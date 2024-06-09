package assignments.recursion;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{4,3,5,3,5,49}));
    }
    public static int maxValue(int[] a){
        if(a.length == 1) return a[0];
        return getMaxValueIndex(a, a[0], 0);
    }

    private static int getMaxValueIndex(int[] a, int max, int position){
        if(position == a.length) return max;

        if(a[position] > max){
            max = a[position];
        }
        return getMaxValueIndex(a,max,++position);
    }
}
