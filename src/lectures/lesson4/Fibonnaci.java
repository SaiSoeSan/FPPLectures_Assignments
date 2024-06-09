package lectures.lesson4;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fibonnaci(3));
    }
    public static int fibonnaci(int n){
        if(n == 1) return 1;
        if(n == 0) return 0;
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
