import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<String, String>();
        meals.put("breakfast", "waffles");
        meals.put("lunch", "Gyros");
        meals.put("dinner", "Enchiladas");

        System.out.println(meals);
    }
}