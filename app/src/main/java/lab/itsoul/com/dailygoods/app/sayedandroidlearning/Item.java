package lab.itsoul.com.dailygoods.app.sayedandroidlearning;

import android.widget.ImageView;
import android.widget.TextView;

public class Item {
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

    public Item(int itemImage, String itemTitle) {
        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
    }
}
