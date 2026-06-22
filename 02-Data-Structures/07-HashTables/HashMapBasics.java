import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        System.out.println(capitalCities);
        
        // Access an item
        System.out.println("Capital of England is: " + capitalCities.get("England"));
        
        // Remove an item
        capitalCities.remove("England");
        
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
