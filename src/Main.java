import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {

        Map<String, String> meals = new HashMap<String, String>();
        meals.put(BREAKFAST, "waffles");
        meals.put(LUNCH, "Gyros");
        meals.put(DINNER, "Enchiladas");

        // prints the entire Map
        System.out.println(meals);

        // method get(key) prints one element of the map
        System.out.println(meals.get(DINNER));

        // method remove(key) removes the element whose key we've provided -> this function does return a value I can store!
        String lunch = meals.remove(LUNCH);

        // method containsKey(key) -> returns a boolean if the map contains the item
        boolean hasLunch = meals.containsKey(LUNCH);

        // method containsValue(value) -> returns a boolean if the map contains the item
        boolean hasGyros = meals.containsValue("Gyros");

        // method size() -> returns how many items are there in a Map
        int size = meals.size();

        System.out.println(lunch + " " + hasLunch + " " + hasGyros + " " + size);

    }
}
