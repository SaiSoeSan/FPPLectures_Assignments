package finalPractice.overrideHashCode.Exception;

public class CalculatePrice {

    public int calculate() throws AccountCheckingException {
       int a = 30;
       int b = 0;
       if(b <= 0){
           throw new AccountCheckingException("hello");
       }
       return a / b;
    }
}
