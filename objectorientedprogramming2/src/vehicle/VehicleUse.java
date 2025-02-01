package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.setMaxSpeed(10);
		v.color = "red";
		v.print();
		
		
		Car c = new Car();
		c.numGear = 10;
		c.color = "black";
		c.setMaxSpeed(100);

		c.print();
		
		
	}

}
