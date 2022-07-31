package week3.day1;

public class Truck extends Vehicle {
	public void steering() {
		System.out.println("Hi this is the truck steering");
	}
	public void drive() {
		System.out.println("here the drive method from Vehicle class is overriden in Truck class");
	}
	public static void main(String[] args) {
		Truck tu = new Truck();
		tu.drive(12);
	}

}
