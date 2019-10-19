package ua.lviv.java.salary;

public class Application {

	public static void main(String[] args) {

		SalaryForHours sh = new SalaryForHours(12);
		sh.SalaryHours();
		SalaryForMonth sm = new SalaryForMonth(12);
		sm.SalaryHours();

	}

}
