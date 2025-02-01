package vehicle;

public class Car extends Vehicle {
int numGear;
boolean isConvertable;
	

//		public Car(int numGear,int maxSpeed) {
//			super(maxSpeed);
//			this.numGear = numGear;
//			System.out.println("Car constructre");
//		}

	public void print() {
		super.print();
//		System.out.println("Vehicle color : " + color);
//		System.out.println("Vehicle Speed : " + getMaxSpeed());
		System.out.println("Car numGear : " + numGear);
		System.out.println("Car isConvertable : " + isConvertable);
	
	}
	
}
