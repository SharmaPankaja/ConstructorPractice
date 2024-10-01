package AssignmentConstructor;
import java.util.*;

public class Q1Triangle {
	private 
	int a,b,c;
	double var,s;
	
	
	
	public Q1Triangle(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void Perimeter()
	{
		System.out.println("Perimeter of Triangle = "+(a+b+c));
		
	}
	
	public void Area()
	{
		s=(a+b+c)/2;
		var=s*(s-a)*(s-b)*(s-c);
		System.out.println("Area of triangle = "+Math.sqrt(var));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for a,b and c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		Q1Triangle tri=new Q1Triangle(a,b,c);
		tri.Perimeter();
		tri.Area();

	}

}
