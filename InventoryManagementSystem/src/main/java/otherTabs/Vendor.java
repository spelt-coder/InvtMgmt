package otherTabs;

import java.util.HashSet;
import java.util.Set;

public class Vendor {

    private static int lastAssignedVendorID = 0;
    private final int vendorID;
    private String vendorName;
    private String products;
    private String email;
    private static final Set<Integer> validVendorIDs = new HashSet<>();



    public Vendor(String vendorName, String products, String email) {
        this.vendorID = ++lastAssignedVendorID;
        validVendorIDs.add(this.vendorID);
        this.vendorName = vendorName;
        this.products = products;
        this.email = email;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVendorID() {
        return vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }


    public String getProducts() {
        return products;
    }

    public String getEmail() {
        return email;
    }
    public static boolean isValidVendorID(int vendorId) {
        return validVendorIDs.contains(vendorId);
    }
    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorID +
                ", vendorName='" + vendorName + '\'' +
                ", contact='" + products + '\'' +
                ", address='" + email + '\'' +
                '}';
    }

}
