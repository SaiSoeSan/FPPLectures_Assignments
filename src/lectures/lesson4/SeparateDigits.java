package lectures.lesson4;

public class SeparateDigits {
    StringBuilder digits = new StringBuilder();
    StringBuilder characters = new StringBuilder();

    public String separateString(String input){
        if(input == null || input.isEmpty()) return input;
        separateDigit(input);
        return digits + " and " + characters;
    }
    private void separateDigit(String s){
        if(s == null || s.isEmpty()) return;
        int mychar = s.charAt(0);
        if(Character.isDigit(mychar)){
            digits.append((char)mychar);
        }else{
            characters.append((char)mychar);
        }
        separateDigit(s.substring(1));
    }

    public static void main(String[] args) {
        SeparateDigits sd = new SeparateDigits();
        System.out.println(sd.separateString("2343242sjflsf"));
    }

}
