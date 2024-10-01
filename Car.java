package AssignmentConstructor;

public class Car {
	private
	String CarModel,CarName,CarOwner;
	int CarPrice ;
	
	public 
	void getModel(String CarModel)
	{
		this.CarModel=CarModel;
	}
	void getName(String CarName)
	{
		this.CarName=CarName;
	}
	void getPrice(int CarPrice)
	{
		this.CarPrice=CarPrice;
	}
	void getOwner(String CarOwner)
	{
		this.CarOwner=CarOwner;
	}
	void display()
	{
		System.out.println("Car Details are ");
		System.out.println(".....................");
		System.out.println("Car Model = "+CarModel);
		System.out.println("Car Name = "+CarName);
		System.out.println("Car Price = "+CarPrice);
		System.out.println("Car Owner = "+CarOwner);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      	Car car=new Car();	
		
		car.getModel("Tata");
		car.getName("Tata BlackBird");
		car.getPrice(1500000);
		car.getOwner("Sharma");
		
		car.display();

	}

}
