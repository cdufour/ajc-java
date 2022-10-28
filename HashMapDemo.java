// Source: https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("England", "Manchester");
    System.out.println(capitalCities);
    System.out.println(capitalCities.get("England")); // Manchester
  }
}