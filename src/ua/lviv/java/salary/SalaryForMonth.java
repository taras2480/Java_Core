package ua.lviv.java.salary;

public class SalaryForMonth implements Salary {

	private int salary;
	
	
	SalaryForMonth(int salary){
		
		this.salary=salary*8*20;
	}
	
	
	@Override
	public void SalaryHours() {
		System.out.println("Worker has "+salary+" dollars for Mounth");
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "SalaryForMonth [salary=" + salary + "]";
	}

	

}
