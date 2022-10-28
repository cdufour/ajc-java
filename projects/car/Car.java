public class Car {

	private int id;
	private String brand;
	private double speed;
	private int power;
	
	public static int count = 0;
	
	public Car(String brand, double speed, int power) {
		this.id = ++count;
		this.brand = brand;
		this.speed = speed;
		this.power = power;
	}
 
	@Override
	public String toString() {
		return "id=" + id + ", marque=" + brand + ", vitesse=" + speed
				+ ", puissance=" + power;
	}
 
}