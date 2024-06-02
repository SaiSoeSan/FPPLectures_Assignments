package assignments.lesson4;

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        //create 3 professors
        Professor professor1 = new Professor("Sai Soe San", 80000, 2009, 12, 15);
        professor1.setNumberOfPublications(5);

        Professor professor2 = new Professor("Cuong", 90000, 2009, 12, 15);
        professor2.setNumberOfPublications(10);

        Professor professor3 = new Professor("Magdy", 100000, 2009, 12, 15);
        professor3.setNumberOfPublications(15);

        //create 2 secretary
        Secretary sec1 = new Secretary("May", 5000, 2014, 10, 23);
        sec1.setOvertimeHours(30);

        Secretary sec2 = new Secretary("Lisa", 6000, 2023, 10, 10);
        sec2.setOvertimeHours(40);

        DeptEmployee[] staff = new DeptEmployee[5];
        staff[0] = professor1;
        staff[1] = professor2;
        staff[2] = professor3;
        staff[3] = sec1;
        staff[4] = sec2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the sum of " +
                "all Professor and Secretary salary in the department : Y / N");
        String answer = sc.nextLine().toUpperCase();
        if (answer.equals("Y")) {

            // department total salary
            double totalSalary = 0.00;
            for (DeptEmployee e : staff) {
                totalSalary += e.computeSalary();
            }
            System.out.println("Total Salary : " + totalSalary);
            System.out.println("Average Salary : " + totalSalary / staff.length);
        }
    }
}
