package week3.day1.assignments;

public class CruiseShip extends Ship {
	
	int noOfPassenger;
	String category;
	
	public void maximumPassengers(int noOfPassenger) {
		System.out.println("Maximum no of Passengers are "+ noOfPassenger);
	}
	public void cruiseCategory(String category) {
		System.out.println("category of cruise is "+ category);
	}
	
	CruiseShip(int noOfPassenger, String category){
		this();
		this.noOfPassenger=noOfPassenger;
		this.category=category;
		this.maximumPassengers(noOfPassenger);
		this.cruiseCategory(category);
	}
	CruiseShip()
	{
		this.noOfPassenger=0;
		this.category=null;
		this.maximumPassengers(noOfPassenger);
		this.cruiseCategory(category);
		this.shipName("Maersk");
		this.shipbuiltYear("2009");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CruiseShip cs= new CruiseShip(20,"Tour Cruise");
	}

}
