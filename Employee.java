package AssignmentConstructor;
import java.util.Scanner;


public class Employee {
	private
	int salary,hrPerDay;
	
	public void getInfo(int salary,int hrPerDay)
	{
		this.salary=salary;
		this.hrPerDay=hrPerDay;
		
	}
	public void AddSal()
	{
		if(salary<500)
			salary=salary+10;
	}
	public void AddWork()
	{
		if(hrPerDay>6)
			salary=salary+5;
	}
	public void finalSalary()
	{
		System.out.println("Final Salary of employee: "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary , hrPerWork;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter Employee's working hour: ");
		hrPerWork=sc.nextInt();
		Employee emp=new Employee();
		emp.getInfo(salary, hrPerWork);
		emp.AddSal();
		emp.AddWork();
		emp.finalSalary();

	}

}
