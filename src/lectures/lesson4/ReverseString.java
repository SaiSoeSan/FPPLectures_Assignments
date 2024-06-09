package lectures.lesson4;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("hello");
    }

    public static void reverseString(String s){
        if(s.equals("") || s == null) return;
        else{
            reverseString(s.substring(1));
            System.out.println(s.charAt(0));
        }
    }
}
