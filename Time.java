package AssignmentConstructor;

public class Time {
	private 
	int hr,min,sec;
	
	public
	Time()
	{
		
	}
	Time(int hr, int min,int sec )
	{
		if(hr<24)
			this.hr=hr;
		else 
			System.out.println("Hour should be less than 24");
		    
		if(min>=0 && min<=60)
			this.min=min;
		else 
		{
			this.hr=hr+1;
			this.min=min-60;
		}
		if(sec>=0 && sec<=60)
			this.sec=sec;
		else
		{
			this.min=min+1;
			this.sec=sec-60;
		}
	}
	void display()
	{
		System.out.println("Time = "+hr+"HR:"+min+"MIN:"+sec+"SEC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1=new Time();
		time1.display();
		System.out.println("==================================");
		Time time=new Time(4,75,34);
		time.display();

	}

}
