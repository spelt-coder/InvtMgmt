package otherTabs;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static otherTabs.Vendor.isValidVendorID;


public class Bill {
    private static int lastAssignedBillID = 0;

    private int number,vendorID, amount;
    private GregorianCalendar date;

    public Bill(int vendorID, int amount, GregorianCalendar date) {
        this.number = ++lastAssignedBillID;
        if (!isValidVendorID(vendorID)) {
            throw new IllegalArgumentException("Invalid vendor ID");
        }
        this.vendorID = vendorID;
        this.amount = amount;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"};

        return "Bill{" +
                "number=" + number +
                ", vendorID=" + vendorID +
                ", amount=" + amount +
                ", date=" + date.get(Calendar.DATE)
                + (months[date.get(Calendar.MONTH)]) +
                + date.get(Calendar.YEAR) +
                '}';
    }
}
