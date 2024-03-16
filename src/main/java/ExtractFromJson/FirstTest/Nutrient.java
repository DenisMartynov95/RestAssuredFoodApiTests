package ExtractFromJson.FirstTest;

public class Nutrient{
    private String name;
    private double amount;
    private String unit;

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public Nutrient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public Nutrient() {
    }


}
