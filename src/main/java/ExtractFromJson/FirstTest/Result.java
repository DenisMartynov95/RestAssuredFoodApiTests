package ExtractFromJson.FirstTest;

public class Result {
    private int id;
    private String title;
    private String image;
    private String imageType;
    private Nutrition nutrition;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getImageType() {
        return imageType;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public Result(int id, String title, String image, String imageType, Nutrition nutrition) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.imageType = imageType;
        this.nutrition = nutrition;
    }

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", imageType='" + imageType + '\'' +
                ", nutrition=" + nutrition +
                '}';
    }
}
