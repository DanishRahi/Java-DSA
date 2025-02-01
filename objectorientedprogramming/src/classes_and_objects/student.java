package classes_and_objects;

public class student {
	
	public String name;
	private final int rollNumber;
	

	public Student(String n) {
		name = n;
	}
	
	public Student(String n , int rn) {
		name = n;
		rollNumber = rn;
		
	}
	
	public void setRollNumber(int rn) {
		if(rn <= 0) {
			return;
		}
		rollNumber = rn;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name + " : " + rollNumber);
		
	}
	public static void main(String[] args) {
		
		public student(string n, int rn);
		name = n;
		rollnumber = rn;
	}

}
