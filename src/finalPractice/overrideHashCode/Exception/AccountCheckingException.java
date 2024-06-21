package finalPractice.overrideHashCode.Exception;

public class AccountCheckingException extends Exception {
    AccountCheckingException(){
        super();
    }
    AccountCheckingException(String msg){
        super(msg);
    }
}
