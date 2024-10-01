package AssignmentConstructor;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Car 1 details: ");
		Car c1=new Car();
		c1.getModel("Tata");
		c1.getName("Tata BlackBird");
		c1.getPrice(1500000);
		c1.getOwner("Sharma");
		c1.display();
		
		System.out.println("===================================");
		System.out.println("Car 2 details: ");
		
		Car c2=new Car();
		c2.getModel("Hyundai");
		c2.getName("Hyundai Creta");
		c2.getPrice(2000000);
		c2.getOwner("Pankaja");
		c2.display();
		
		System.out.println("===================================");
		System.out.println("Car 3 details: ");
		
		Car c3=new Car();
		c3.getModel("Kia");
		c3.getName("Kia Seltos");
		c3.getPrice(2450000);
		c3.getOwner("Pankaja");
		c3.display();

	}

}
