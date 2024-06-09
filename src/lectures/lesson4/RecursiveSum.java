package lectures.lesson4;

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }
    public static int recursiveSum(int n){
        if( n <= 1) return 1;
        return n + recursiveSum(n - 1);
    }
}
