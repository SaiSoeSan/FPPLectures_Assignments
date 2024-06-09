package lectures.lesson4;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println("hello".substring(0));
        System.out.println(lengthOfString("hello"));
    }
    public static int lengthOfString(String s){
        if(s == "" || s == null) return 0;
        return 1 + lengthOfString(s.substring(1));
    }
}
