package lectures.lesson8.consistcompareTo;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	// instance fields
	private String fname;
	private String lname;
	private LocalDate hireDay;

	// constructor
	public Employee(String fname, String lname, LocalDate hireDay) {
		this.fname = fname;
		this.lname = lname;
		this.hireDay = hireDay;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(fname, employee.fname) && Objects.equals(lname, employee.lname) && Objects.equals(hireDay, employee.hireDay);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"fname='" + fname + '\'' +
				", lname='" + lname + '\'' +
				", hireDay=" + hireDay +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, lname, hireDay);
	}
}
