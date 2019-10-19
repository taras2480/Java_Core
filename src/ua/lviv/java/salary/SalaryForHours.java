package ua.lviv.java.salary;

public class SalaryForHours implements Salary {

	private int salary;

	SalaryForHours(int salary) {

		this.salary = salary;
	}

	@Override
	public void SalaryHours() {

		System.out.println("Worker has " + salary + " dollars for hours");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryForHours [salary=" + salary + "]";
	}

}
