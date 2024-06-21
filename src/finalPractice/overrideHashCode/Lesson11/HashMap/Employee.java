package finalPractice.overrideHashCode.Lesson11.HashMap;

import java.util.HashMap;

public class Employee {
    private String firstName;
    private String lastName;

    private HashMap<String,Double> record = new HashMap<>();

    public void addRecrod(String date, double salary){
        record.put(date,salary);
    }

    public void printPaymentAmount(String data){
        Double salaryObject = record.get(data);
        if(salaryObject == null){
            System.out.println("no record");
        }else{
            System.out.println(salaryObject);
        }
    }

    public void printAverageSalary(){
        double salary = 0.0;
        int count = 0;

        for(String i : record.keySet()){
            salary += record.get(i);
            count++;
        }

//        for(double s : record.values()){
//            salary += s;
//            count++;
//        }



        System.out.println("Average paycheck for "+firstName+" "+lastName+" was "+salary/count);
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salaryRecord=" + record + "]";
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFirstName("Jim");
        e.setLastName("Jones");
        for(int i = 0; i < 12; ++i) {
            e.addRecrod(i+"/15/2011", 3070+5*i);
        }
        System.out.println(e);
        e.printPaymentAmount("3/15/2011");
        e.printPaymentAmount("5/15/2010");
        e.printAverageSalary();

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
