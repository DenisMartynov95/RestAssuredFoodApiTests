package ExtractFromJson.GetMethods.SecondTest;

public class Root {
    private int id;
    private String title;
    private String image;
    private String imageType;
    private int calories;
    private String protein;
    private String fat;
    private String carbs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public Root(int id, String title, String image, String imageType, int calories, String protein, String fat, String carbs) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.imageType = imageType;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public Root() {

    }

    @Override
    public String toString() {
        return "Root{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", imageType='" + imageType + '\'' +
                ", calories=" + calories +
                ", protein='" + protein + '\'' +
                ", fat='" + fat + '\'' +
                ", carbs='" + carbs + '\'' +
                '}';
    }
}
