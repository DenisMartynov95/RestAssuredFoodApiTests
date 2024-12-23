package TestsData.Get;

import java.util.HashMap;
import java.util.Map;

public class Parameters {

    // Для запроса первого теста
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

    // Для третьего теста

    public static final String INGREDIENTS = "ingredients";
    public static final String LIMIT_LICENSE = "limitLicense";
    public static final String RANKING = "ranking";
    public static final String IGNORE_PANTRY = "ignorePantry";

    public static Map<String, Object> getParam3() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(INGREDIENTS, "apples,flour,sugar");
        parameters.put(NUMBER, "5");
        parameters.put(LIMIT_LICENSE, "true");
        parameters.put(RANKING, "2");
        parameters.put(IGNORE_PANTRY, "true");
        return parameters;
    }


}
