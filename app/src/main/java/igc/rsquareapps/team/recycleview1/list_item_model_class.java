package igc.rsquareapps.team.recycleview1;

import android.widget.ImageView;
import android.widget.TextView;

public class list_item_model_class {
    private int icon;
    private String title;
    list_item_model_class(){}

    public list_item_model_class(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
