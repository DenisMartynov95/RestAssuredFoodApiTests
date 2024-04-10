package TestsData.Get;

import java.util.HashMap;
import java.util.Map;

public class Parameters {

    // Для первого теста
    public static final String QUERY = "query";
    public static final String MAX_FAT = "maxFat";
    public static final String NUMBER = "number";

    public static Map<String, Object> getParam1() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(QUERY, "pasta");
        parameters.put(MAX_FAT, 25);
        parameters.put(NUMBER, 1);
        return parameters;
    }

    // Для второго теста

    public static final String MAX_CALORIES = "maxCalories";

    public static Map<String, Object> getParam2() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(MAX_CALORIES, 1);
        return parameters;
    }

}
