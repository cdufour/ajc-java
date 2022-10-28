public class TestCar {
 
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		cars[0] = new Car("BMW", 220, 8);
		cars[1] = new Car("Ford", 200, 6);
		cars[2] = new Car("Audi", 240, 8);
 
		for (Car car : cars) {
			System.out.println(car);
		}

		System.out.println("Le nombre des voitures est : " + Car.count);
 
	}
}
