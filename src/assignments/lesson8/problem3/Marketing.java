package assignments.lesson8.problem3;

import java.util.Objects;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return employeename + " " + productname + " " + salesamount;
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Marketing e)) return false;
		if (this == o) return true;
        return Double.compare(e.getSalesamount(), salesamount) == 0 &&
				Objects.equals(e.getEmployeename(), employeename) &&
				Objects.equals(e.getProductname(), productname);
	}
}