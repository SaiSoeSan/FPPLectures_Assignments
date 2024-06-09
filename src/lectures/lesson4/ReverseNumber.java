package lectures.lesson4;

public class ReverseNumber {
    public static void main(String[] args) {
        xMethod(134566);
    }
    public static void xMethod(int n){
        if(n <= 0) {
            System.out.println("");
            return;
        }
        System.out.print(n % 10);
        xMethod(n / 10);
    }
}
