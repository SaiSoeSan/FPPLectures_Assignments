package assignments.lesson9.prob3;

import java.util.Stack;

public class BrowserHistory {
    private String currentUrl;
    private Stack<String> forwardStack;
    private Stack<String> backwardStack;

    public BrowserHistory(String currentUrl){
        this.forwardStack = new Stack<>();
        this.backwardStack = new Stack<>();
        this.currentUrl = currentUrl;
    }

    public void visit(String url){
        //current url is previous url that we are currently at
       if(url == null) return;

       if(currentUrl != null){
           backwardStack.push(currentUrl);
       }

       currentUrl = url;
       System.out.println("Visited: " + currentUrl);
    }

    public void back(){
        if(!backwardStack.isEmpty()){
            forwardStack.push(currentUrl);
            currentUrl = backwardStack.pop();
            System.out.println("Back to: " + currentUrl);
        }else{
            System.out.println("No history to back");
        }
    }

    public void forward(){
        if(!forwardStack.isEmpty()){
            backwardStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println("Forward to: " + currentUrl);
        }else{
            System.out.println("No forward");
        }
    }
}

class TestBrowserHistory{
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("home.html");

        history.visit("page1.html");
        history.visit("page2.html");
        history.back();
        history.back();
        history.forward();
        history.forward();
        history.visit("page3.html");
        history.back();

    }
}

