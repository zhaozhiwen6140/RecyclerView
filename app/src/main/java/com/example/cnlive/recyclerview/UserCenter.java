package com.example.cnlive.recyclerview;

/**
 * Created by CNLive on 2016/3/2.
 */
public class UserCenter {
    public static final int TYPE_HEAD=0;
    public static final int TYPE_ITEM=1;
    private int itemType;
    private int itemIcon;
    private String itemTitle;

    public UserCenter(int itemType, int itemIcon, String itemTitle) {
        this.itemType = itemType;
        this.itemIcon = itemIcon;
        this.itemTitle = itemTitle;
    }

    public static int getTypeHead() {
        return TYPE_HEAD;
    }

    public static int getTypeItem() {
        return TYPE_ITEM;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    @Override
    public String toString() {
        return "UserCenter{" +
                "itemIcon=" + itemIcon +
                ", itemType=" + itemType +
                ", itemTitle='" + itemTitle + '\'' +
                '}';
    }
}
