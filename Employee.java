package javaCalismalar;

public class Employee {

	private String name;
	public double salary;
	private int workHours, hireYear;

	public Employee(int hireYear, int workHouse, double salary, String name) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHouse;
		this.hireYear = hireYear;
	}
	public double taxMethod() {
		if (this.salary > 1000) {
			return (salary * 0.03);
		}
		return 0;
	}
	public double bonusMethod() {
		int extraHours=workHours-40;
		return extraHours * 30;
	}
	
	public double raiseSalary() {
		int year=2020-this.hireYear;
		if (year < 10) {
			 return (salary * 0.05);
		} else if (year>= 10 && year < 20) {
			return (salary * 0.1);
		} else {
			 return (salary * 0.15);
		}
	}
	
//public String toString() {
		
	//}
}
