package otherTabs;

import java.util.HashSet;
import java.util.Set;

public class Vendor {

    private static int lastAssignedVendorID = 0;
    private int vendorId;
    private String vendorName;
    private String contact;
    private String address;
    private static Set<Integer> validVendorIDs = new HashSet<>();



    public Vendor(String vendorName, String contact, String address) {
        this.vendorId = ++lastAssignedVendorID;;
        validVendorIDs.add(this.vendorId);
        this.vendorName = vendorName;
        this.contact = contact;
        this.address = address;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }


    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
    public static boolean isValidVendorID(int vendorId) {
        return validVendorIDs.contains(vendorId);
    }
    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorId +
                ", vendorName='" + vendorName + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
