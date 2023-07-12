package otherTabs;

import com.example.inventorymanagementsystem.Product;

public class IssuedGoods {
    private int itemID;
    private int salesCount;
    private String item;
    private String recipient;

    public IssuedGoods(int itemID, int salesCount, String item, String recipient) {
        if (!isValidItemID(itemID)) {
            throw new IllegalArgumentException("Invalid item ID");
        }
        this.itemID = itemID;
        this.salesCount = salesCount;
        this.item = item;
        this.recipient = recipient;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        if (!isValidItemID(itemID)) {
            throw new IllegalArgumentException("Invalid item ID");
        }
        this.itemID = itemID;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    private boolean isValidItemID(int itemID) {

        return Product.isValidItemID(itemID);
    }

    @Override
    public String toString() {
        return "IssuedGoods{" +
                "itemID=" + itemID +
                ", salesCount=" + salesCount +
                ", item='" + item + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
