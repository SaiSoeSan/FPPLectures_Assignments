package assignments.lesson11.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		if(socSecNums == null) return null;
		List<Employee> employees = new ArrayList<>();
		for(String s : socSecNums){
			if(table.containsKey(s)){
				Employee e = table.get(s);
				if(e.getSalary() > 80000){
					employees.add(e);
				}
			}
		}
		Collections.sort(employees,(p1,p2)->{
			return p1.getSsn().compareTo(p2.getSsn());
		});
		return employees;
	}
	
}
