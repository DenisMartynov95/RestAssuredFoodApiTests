package ExtractFromJson.GetMethods.ThirdTest;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private int id;
    private String title;
    private String image;
    private String imageType;
    private int usedIngredientCount;
    private int missedIngredientCount;
    private ArrayList<MissedIngredient> missedIngredients;
    private ArrayList<UsedIngredient> usedIngredients;
    private ArrayList<UnusedIngredient> unusedIngredients;
    private int likes;

    // Метод для цикла по перебору и предоставлению названия блюд для сравнения с ассертом
//    public List<String> getTitles() {
//        List<String> titles = new ArrayList<>();
//        titles.add(this.title); // Добавляем название текущего блюда в список
//        return titles;
//    }

    public static List<String> getTitles(List<Root> roots) {
        List<String> titles = new ArrayList<>();
        for (Root root : roots) {
            titles.add(root.getTitle());
        }
        return titles;
    }

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

    public int getUsedIngredientCount() {
        return usedIngredientCount;
    }

    public void setUsedIngredientCount(int usedIngredientCount) {
        this.usedIngredientCount = usedIngredientCount;
    }

    public int getMissedIngredientCount() {
        return missedIngredientCount;
    }

    public void setMissedIngredientCount(int missedIngredientCount) {
        this.missedIngredientCount = missedIngredientCount;
    }

    public ArrayList<MissedIngredient> getMissedIngredients() {
        return missedIngredients;
    }

    public void setMissedIngredients(ArrayList<MissedIngredient> missedIngredients) {
        this.missedIngredients = missedIngredients;
    }

    public ArrayList<UsedIngredient> getUsedIngredients() {
        return usedIngredients;
    }

    public void setUsedIngredients(ArrayList<UsedIngredient> usedIngredients) {
        this.usedIngredients = usedIngredients;
    }

    public ArrayList<UnusedIngredient> getUnusedIngredients() {
        return unusedIngredients;
    }

    public void setUnusedIngredients(ArrayList<UnusedIngredient> unusedIngredients) {
        this.unusedIngredients = unusedIngredients;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Root(int id, String title, String image, String imageType, int usedIngredientCount, int missedIngredientCount, ArrayList<MissedIngredient> missedIngredients, ArrayList<UsedIngredient> usedIngredients, ArrayList<UnusedIngredient> unusedIngredients, int likes) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.imageType = imageType;
        this.usedIngredientCount = usedIngredientCount;
        this.missedIngredientCount = missedIngredientCount;
        this.missedIngredients = missedIngredients;
        this.usedIngredients = usedIngredients;
        this.unusedIngredients = unusedIngredients;
        this.likes = likes;
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
                ", usedIngredientCount=" + usedIngredientCount +
                ", missedIngredientCount=" + missedIngredientCount +
                ", missedIngredients=" + missedIngredients +
                ", usedIngredients=" + usedIngredients +
                ", unusedIngredients=" + unusedIngredients +
                ", likes=" + likes +
                '}';
    }
}
