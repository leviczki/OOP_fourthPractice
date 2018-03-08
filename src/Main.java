//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Employee foo = new Employee();
		
		/*System.out.print("Kérem a nevet: ");
		foo.employeeName = input.nextLine();
		System.out.print(foo.employeeName + " fizetése: ");
		foo.salary = input.nextLong();
		System.out.println(foo.displayInfo(foo.salary, foo.employeeName));
		foo.salary = foo.increaseSalary(300000, foo.salary);
		System.out.println(foo.displayInfo(foo.salary, foo.employeeName));*/
		
		foo.setEmployeeName("Egyik");
		foo.setSalary(100);
		
		System.out.println(foo.getEmployeeName() + " " + foo.getSalary());
		
		foo.setSalary(500);
		System.out.println(foo.getEmployeeName() + " " + foo.getSalary());
		
		foo.displayInfo(foo.getSalary(), foo.getEmployeeName());
		foo.increaseSalary(500, foo.getSalary());
		
		System.out.println("A megadott paraméterek közé esik: " + foo.isInSalaryRange(150, 2000));
		System.out.println("Tax: " + foo.getTax());
		
		Employee proba = new Employee();
		proba.setEmployeeName("asd");
		proba.setSalary(50);
		
		System.out.println("Nagyobb a fizetése: " + foo.hasHigherSalary(proba));
		
		//////////////////////////////////////////////////////////////////
		/*Employee proba = new Employee();
		proba.setEmployeeName("asd");
		proba.setSalary(50);
		System.out.println(proba.getEmployeeName()+" "+proba.getSalary());
		System.out.println();*/
		
		
	}
}
