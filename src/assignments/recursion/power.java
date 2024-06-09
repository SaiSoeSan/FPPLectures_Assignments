package assignments.recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(power(3,2));
    }
    public static int power(int x, int n){
        if(n <= 0) return 1;
        return x * power(x, n-1);
    }
}
