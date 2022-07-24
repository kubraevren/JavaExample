package javaCalismalar;

public class EmpDriver {

	public static void main(String[] args) {
		Employee emp1=new Employee(1985, 45, 2000,"Kemal");
		
		System.out.println("tax: " + emp1.taxMethod());
		System.out.println("bonus: " + emp1.bonusMethod());
		System.out.println("increase salary: "+ emp1.raiseSalary());
	
		double totalSalary=emp1.salary-emp1.taxMethod()+emp1.bonusMethod();
		System.out.println("total salary: "+ totalSalary);
		System.out.println("salary raise: " + (emp1.salary+emp1.raiseSalary()));
	}

	

	

	
	
	
}
