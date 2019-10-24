package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

public class SavedLocations {
    private int itemImage;
    private String itemTitle;

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public SavedLocations(int itemImage, String itemTitle) {
        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
    }
}
