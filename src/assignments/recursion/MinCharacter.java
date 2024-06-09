package assignments.recursion;

public class MinCharacter {
    public static void main(String[] args) {
        System.out.println(minCharacter("abcd"));
    }

    public static char minCharacter(String s){
        if(s == "" || s == null) System.exit(0);
        if(s.length() == 1) return s.charAt(0);
        return getMinChar(s,s.charAt(0));
    }
    private static char getMinChar(String s, char min){
        if(s == "") return min;
        if(s.charAt(0) < min){
            min = s.charAt(0);
        }
        return getMinChar(s.substring(1), min);
    }
}
