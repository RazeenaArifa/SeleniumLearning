package week3.day1.assignments;

public class CargoShip extends Ship {
	int capacity;
	public void cargoCapacityinTons(int capacity) {
		System.out.println("Ship Capacity "+capacity);
	}
	 
	CargoShip()
	{
		this.cargoCapacityinTons(20);
		this.shipName("Maersk");
		this.shipbuiltYear("2009");
		
	}

	public static void main(String[] args) {
		
		CargoShip c = new CargoShip();

	}

}
