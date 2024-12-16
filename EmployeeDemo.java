package labprograms;
import java.util.Scanner;

 class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee( int id, String name, int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;}
	public  int raiseSalary(int percent ) {
		return this.salary+ this.salary*percent/100;
	}
}
public class EmployeeDemo {
	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
int id;
String name;
int salary;
System.out.println("Enter Employee id, name, salary");
id=scanner.nextInt();
name=scanner.next();
salary=scanner.nextInt();
Employee employee = new
Employee (id,name,salary);
System.out.println(" Enter percent raise");
int percent = scanner.nextInt();
int raiseSalary = employee.raiseSalary(percent);
System.out.println("raised salary: "+ raiseSalary);
	}

}
