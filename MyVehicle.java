package week3.day1;

public class MyVehicle extends Vehicle {
	public static void main(String args[]) {
		AshokLeyland al = new AshokLeyland();
		al.drive();
		al.steering();
		al.wipersOn();
		
		Suzuki su = new Suzuki();
		//su.drive(5,6);
		su.buttonStart();
		su.kickstart();
		
	}
	
	

}
