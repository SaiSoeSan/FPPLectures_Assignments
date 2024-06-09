package lectures.lesson4;

public class CountDown {
    public static void main(String[] args) {
//        String type = "Employee";
//        if(type == "Employee"){
//            System.out.println("hello");
//        }else{
//            System.out.println("no");
//        }
        countDown(4,"Salary");
    }

    public static void countDown(int n, String type){
        if(type == "Salary"){
            System.out.println("salary");
        }else if(type == "Name"){
            System.out.println("name");
        }
//        if(n <= 0) System.out.println("");
//        else {
//            System.out.println(n);
//            countDown(n - 1);
//        }
    }
}
