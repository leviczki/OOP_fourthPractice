import java.util.Scanner;

public class NewMain {
	
	public static void main(String[] args) {
		Employee[] empArr = new Employee[10];
		
		
		for (int i = 0; i < empArr.length; i++) {
			empArr[i] = new Employee();
			
			
			/*empArr[i].setEmployeeName(input.nextLine());
			empArr[i].setSalary(input.nextLong());*/
			
			empArr[i].setEmployeeName("MindlessWorker_"+i);
			empArr[i].setSalary((long)((Math.random()*50000)+1));
			
			System.out.println("Name: "+empArr[i].getEmployeeName()+" \t Salary: "+empArr[i].getSalary());
		}
		
		System.out.println("Leggazdagabb: "+whoHasBiggestSalary(empArr));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("intervallum start: ");
		long salaryStart = input.nextLong();
		System.out.println("intervallum end: ");
		long salaryEnd = input.nextLong();
		System.out.println("Intervallum db: "+salaryRange(empArr, salaryStart, salaryEnd));
		
		input.close();
		
		System.out.println("Salary mean: "+salaryMean(empArr));
		System.out.println("Sum taxs: "+sumTaxs(empArr));
	}
	
	public static String whoHasBiggestSalary(Employee[] empArr) {
		long max = 0;
		String name = ""
				;
		for (Employee employee : empArr) {
			if(employee.getSalary() > max) {
				max = employee.getSalary();
				name = employee.getEmployeeName();
			}
		}
		
		return name;
	}
	
	public static int salaryRange(Employee[] empArr, long salaryStart, long salaryEnd) {
		int counter = 0;
		
		for (Employee employee : empArr) {
			if(employee.getSalary() > salaryStart && employee.getSalary() <= salaryEnd) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public static long salaryMean(Employee[] empArr) {
		long sum = 0;
		
		for (Employee employee : empArr) {
			sum += employee.getSalary();
		}
		
		return (long)(sum/empArr.length);
	}
	
	public static long sumTaxs(Employee[] empArr) {
		long sum = 0;
		
		for (Employee employee : empArr) {
			sum += (employee.getSalary()*0.16);
		}
		
		return (long)(sum/empArr.length);
	}
}
