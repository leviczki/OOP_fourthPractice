
public class Employee {
	
	private String employeeName;
	private long salary;
///////////////////////////////////////////////////////////////////////////////
	public long increaseSalary(long increase, long salary) {
		return salary+=increase;
	}
	
	public String displayInfo(long salary, String name) {
		return "Name: " + name + "\t\tSalary: "+ salary;
	}
//////////////////////////////////////////////////////////////////////////////	
	public long increaseSalary2(long increase, long salary) {
		return salary+=increase;
	}
	
	public String displayInfo2() {
		return "Name: " + this.employeeName + "\t\tSalary: "+ this.salary;
	}
///////////////////////////////////////////////////////////////////////////////
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
///////////////////////////////////////////////////////////////////////////////	
	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		if(this.salary >= salaryStart && this.salary < salaryEnd)
			return true;
		else return false;
	}
	
	public long getTax() {
		return (long)(this.salary*0.16);
	}
	
	public boolean hasHigherSalary(Employee employee) {
		if(this.salary > employee.getSalary())
			return true;
		else return false;
	}
}
