package ExtractFromJson.FirstTest;

import java.util.ArrayList;

public class Nutrition {
    private ArrayList<Nutrient> nutrients;

    public ArrayList<Nutrient> getNutrients() {
        return nutrients;
    }

    public Nutrition(ArrayList<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }

    public Nutrition() {
    }
}
