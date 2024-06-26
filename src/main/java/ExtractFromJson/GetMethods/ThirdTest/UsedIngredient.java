package ExtractFromJson.GetMethods.ThirdTest;

import java.util.ArrayList;

public class UsedIngredient {

    private int id;
    private double amount;
    private String unit;
    private String unitLong;
    private String unitShort;
    private String aisle;
    private String name;
    private String original;
    private String originalName;
    private ArrayList<String> meta;
    private String image;
    private String extendedName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitLong() {
        return unitLong;
    }

    public void setUnitLong(String unitLong) {
        this.unitLong = unitLong;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public ArrayList<String> getMeta() {
        return meta;
    }

    public void setMeta(ArrayList<String> meta) {
        this.meta = meta;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(String extendedName) {
        this.extendedName = extendedName;
    }

    public UsedIngredient(int id, double amount, String unit, String unitLong, String unitShort, String aisle, String name, String original, String originalName, ArrayList<String> meta, String image, String extendedName) {
        this.id = id;
        this.amount = amount;
        this.unit = unit;
        this.unitLong = unitLong;
        this.unitShort = unitShort;
        this.aisle = aisle;
        this.name = name;
        this.original = original;
        this.originalName = originalName;
        this.meta = meta;
        this.image = image;
        this.extendedName = extendedName;
    }
    public UsedIngredient() {

    }

    @Override
    public String toString() {
        return "UsedIngredient{" +
                "id=" + id +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", unitLong='" + unitLong + '\'' +
                ", unitShort='" + unitShort + '\'' +
                ", aisle='" + aisle + '\'' +
                ", name='" + name + '\'' +
                ", original='" + original + '\'' +
                ", originalName='" + originalName + '\'' +
                ", meta=" + meta +
                ", image='" + image + '\'' +
                ", extendedName='" + extendedName + '\'' +
                '}';
    }
}