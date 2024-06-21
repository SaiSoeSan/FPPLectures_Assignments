package finalPractice.overrideHashCode.Exception;

public class Main {
    public static void main(String[] args){
        try {
           CalculatePrice cp = new CalculatePrice();
           cp.calculate();
        } catch (AccountCheckingException e) {
            System.out.println(e);
        }
    }
}
