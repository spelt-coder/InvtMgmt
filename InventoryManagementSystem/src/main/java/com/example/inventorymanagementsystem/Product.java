package com.example.inventorymanagementsystem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

import static otherTabs.Vendor.isValidVendorID;

// Base class for all products
public class Product {
    private static int lastAssignedItemID = 0;
    private int itemID, vendorID, quantity, buyingPrice, sellingPrice, totalPrice;
    private String itemName;
    private static final Set<Integer> validItemIDs = new HashSet<>();

    public Product(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        this.itemID = ++lastAssignedItemID;
        validItemIDs.add(this.itemID);
//        if (!isValidVendorID(vendorID)) {
//            throw new IllegalArgumentException("Invalid vendor ID");
//        }
        this.vendorID = vendorID;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.itemName = itemName;
        this.totalPrice = quantity * sellingPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Method to add a valid item ID to the set
    public static void addValidItemID(int itemID) {
        validItemIDs.add(itemID);
    }

    // Method to check if an item ID is valid
    public static boolean isValidItemID(int itemID) {
        return validItemIDs.contains(itemID);
    }
    @Override
    public String toString() {
        return "Product{" +
                "itemID=" + itemID +
                ", itemName='" + itemName +
                ", vendorID=" + vendorID +
                ", quantity=" + quantity +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                ", totalPrice=" + totalPrice + '\'' +
                '}';
    }

}

//1.Beverages
class Beverages extends Product {
    public Beverages(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//2.Bread/Bakery
class Bread extends Product {
    public Bread(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}



//3.Canned/Jarred Goods
class CannedGoods extends Product {
    public CannedGoods (int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//4.Dairy products
class DairyProducts extends Product {
    public DairyProducts(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//5.Dry/Baking Goods
class DryGoods extends Product {
    public DryGoods(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//6.Frozen products
class FrozenProducts extends Product {
    public FrozenProducts(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//7.Meat
class Meat extends Product {
    public Meat (int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//8.Farm produce
class FarmProduce extends Product {
    public FarmProduce(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//9.Home Cleaners
class HomeCleaners extends Product {
    public HomeCleaners(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//10.Paper Goods
class PaperGoods extends Product {
    public PaperGoods(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
}

//Home Care
class HomeCare extends Product {
    public HomeCare(int vendorID,String itemName, int quantity, int buyingPrice, int sellingPrice) {
        super(vendorID, itemName, quantity, buyingPrice, sellingPrice);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeCare homeCare = (HomeCare) o;
        return getItemName() == homeCare.getItemName() &&
                getVendorID() == homeCare.getVendorID() &&
                getQuantity() == homeCare.getQuantity() &&
                getBuyingPrice() == homeCare.getBuyingPrice() &&
                getSellingPrice() == homeCare.getSellingPrice()  &&
                Objects.equals(getItemName(), homeCare.getItemName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemID(), getVendorID(), getQuantity(), getBuyingPrice(), getSellingPrice(), getTotalPrice(), getItemName());
    }

}





