package AssignmentConstructor;

public class Complex {
	private 
	int real,imaginary;
	
	Complex()
	{
		
	}
	public Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void addComp(Complex C1,Complex C2)
	{
		Complex complex = new Complex();
		complex.real=C1.real+C2.real;
		complex.imaginary=C1.imaginary+C2.imaginary;
		System.out.println("Addition = "+complex.real+"+"+complex.imaginary+"i");
	}
	public void subComp(Complex C1,Complex C2)
	{
		Complex complex = new Complex();
		complex.real=C1.real-C2.real;
		complex.imaginary=C1.imaginary-C2.imaginary;
		System.out.println("Subtraction = "+complex.real+"+"+complex.imaginary+"i");
	}
	public void mulComp(Complex C1,Complex C2)
	{
		Complex complex = new Complex();
		complex.real=C1.real*C2.real;
		complex.imaginary=C1.imaginary*C2.imaginary;
		System.out.println("Multiplication = "+complex.real+"+"+complex.imaginary+"i");
	}
	public void printComplex()
	{
          System.out.println("Complex Number: "+real+"+"+imaginary+"i");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c1= new Complex(7, 12);
		c1.printComplex();
		System.out.println("==========================");
		Complex c2= new Complex(5, 6);
		c2.printComplex();
		System.out.println("==========================");
		Complex c3= new Complex();
		c3.addComp(c1, c2);
		System.out.println("==========================");
		c3.subComp(c1, c2);
		System.out.println("==========================");
		c3.mulComp(c1, c2);
		
	}

}
