package assignments.lesson8.problem2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> employees) {
		//return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return

		double sum = 0.0;
		if(employees == null) return sum;
		for(EmployeeData employee : employees){
			if(employee != null){
				sum += employee.getSalary();
			}
		}
		return sum;
	}
}
