package lectures.lesson4;

public class Expontential {
    public static void main(String[] args) {
        System.out.println(getPower(2,3));
    }

    public static double getPower(int x, int n){
        if(n <= 0) return 1;
        return x * getPower(x,n-1);
    }
}
