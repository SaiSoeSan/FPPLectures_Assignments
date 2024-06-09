package assignments.recursion;

public class Palidrom {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isNumberPalidrom(n));
    }
    public static boolean isNumberPalidrom(int n){
        int result = palidromNumber(n,0);
        return result == n;
    }
    public static int palidromNumber(int n, int reverse){
        if(n == 0) return reverse;

        int lastDigit = n % 10;  // 1 // 2 // 1
        reverse =  reverse * 10+ lastDigit;  // 0 * 10 + 1 // 1 => 12 // 12 * 10 + 121
        n /= 10;  // 12 // 1 // 0

        return palidromNumber(n,reverse);
    }
}
