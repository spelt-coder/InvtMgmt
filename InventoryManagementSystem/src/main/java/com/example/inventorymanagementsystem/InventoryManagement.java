package com.example.inventorymanagementsystem;


import mycollections.MyList;
import mycollections.MyMap;
import mycollections.MyQueue;
import mycollections.MyStack;
import otherTabs.Bill;
import otherTabs.IssuedGoods;
import otherTabs.Vendor;

public class InventoryManagement{
    @Override
    public String toString() {
        return "InventoryManagement{" +
                "beveragesStack=" + beveragesStack +
                "\nbreadStack=" + breadStack +
                "\ncannedGoodsStack=" + cannedGoodsStack +
                "\ndairyProductsStack=" + dairyProductsStack +
                "\ndryGoodsQueue=" + dryGoodsQueue +
                "\nfrozenProductsQueue=" + frozenProductsQueue +
                "\nmeatQueue=" + meatQueue +
                "\nfarmProduceList=" + farmProduceList +
                "\nhomeCleanersList=" + homeCleanersList +
                "\npaperGoodsList=" + paperGoodsList +
                "\nhomeCareList=" + homeCareList +
                "\nvendorMap=" + vendorMap +
                "\nbillList=" + billList +
                "\nissuedGoodsMap=" + issuedGoodsMap +
                '}';
    }

    private static MyStack<Product> beveragesStack;
    private  static MyStack<Product> breadStack;
    private static MyStack<Product> cannedGoodsStack;
    private static MyStack<Product> dairyProductsStack;

    private static MyQueue<Product> dryGoodsQueue;
    private static MyQueue<Product> frozenProductsQueue;
    private static MyQueue<Product> meatQueue;

    private static MyList<Product> farmProduceList;
    private static MyList<Product> homeCleanersList;
    private static MyList<Product> paperGoodsList;
    private static MyList<Product> homeCareList;

    private static MyMap<Vendor> vendorMap; // Key: Vendor ID, Value: Vendor
    private static MyList<Bill> billList;
    private static MyMap<IssuedGoods> issuedGoodsMap;



    public MyStack<Product> getBeveragesStack() {
        return beveragesStack;
    }

    public MyStack<Product> getBreadStack() {
        return breadStack;
    }

    public MyStack<Product> getCannedGoodsStack() {
        return cannedGoodsStack;
    }

    public MyStack<Product> getDairyProductsStack() {
        return dairyProductsStack;
    }

    public MyQueue<Product> getDryGoodsQueue() {
        return dryGoodsQueue;
    }

    public MyQueue<Product> getFrozenProductsQueue() {
        return frozenProductsQueue;
    }

    public MyQueue<Product> getMeatQueue() {
        return meatQueue;
    }

    public MyList<Product> getFarmProduceList() {
        return farmProduceList;
    }

    public MyList<Product> getHomeCleanersList() {
        return homeCleanersList;
    }

    public MyList<Product> getPaperGoodsList() {
        return paperGoodsList;
    }

    public MyList<Product> getHomeCareList() {
        return homeCareList;
    }

    public MyMap<Vendor> getVendorMap() {
        return vendorMap;
    }

    public MyList<Bill> getBillList() {
        return billList;
    }
    public MyMap<IssuedGoods> getIssuedGoodsMap() {
        return issuedGoodsMap;
    }

    public InventoryManagement() {
        //Stacks for categories 1 to 4
        beveragesStack = new MyStack<>();
        breadStack = new MyStack<>();
        cannedGoodsStack = new MyStack<>();
        dairyProductsStack = new MyStack<>();

        //Queues for categories 5 to 7
        dryGoodsQueue = new MyQueue<>();
        frozenProductsQueue = new MyQueue<>();
        meatQueue = new MyQueue<>();

        //Lists for categories 8 to 11
        farmProduceList = new MyList<>();
        homeCleanersList = new MyList<>();
        paperGoodsList = new MyList<>();
        homeCareList = new MyList<>();

        vendorMap = new MyMap<>();
        billList = new MyList<>();
        issuedGoodsMap = new MyMap<>();

    }

    public void addBeverage(Beverages beverage) {
        beveragesStack.push(beverage);
    }

    public Product removeBeverage() {
        return beveragesStack.pop();
    }

    public void addBread(Bread bread) {
        breadStack.push(bread);
    }

    public Product removeBread() {
        return breadStack.pop();
    }

    public void addCannedGoods(CannedGoods cannedGoods) {
        cannedGoodsStack.push(cannedGoods);
    }

    public Product removeCannedGoods() {
        return cannedGoodsStack.pop();
    }

    public void addDairyProducts(DairyProducts dairyProducts) {
        dairyProductsStack.push(dairyProducts);
    }

    public Product removeDairyProducts() {
        return dairyProductsStack.pop();
    }

    public void addDryGoods(DryGoods dryGoods) {
        dryGoodsQueue.add(dryGoods);
    }

    public Product removeDryGoods() {
        return dryGoodsQueue.remove();
    }

    public void addFrozenProducts(FrozenProducts frozenProducts) {
        frozenProductsQueue.add(frozenProducts);
    }


    public Product removeFrozenProducts() {
        return frozenProductsQueue.remove();
    }

    public void addMeat(Meat meat) {
        meatQueue.add(meat);
    }

    public Product removeMeat() {
        return meatQueue.remove();
    }

    public void addFarmProduce(FarmProduce farmProduce) {
        farmProduceList.add(farmProduce);
    }

    public boolean removeFarmProduce(FarmProduce farmProduce) {
        return farmProduceList.remove(farmProduce);
    }

    public void addHomeCleaners(HomeCleaners homeCleaners) {
        homeCleanersList.add(homeCleaners);
    }

    public boolean removeHomeCleaners(HomeCleaners homeCleaners) {
        return homeCleanersList.remove(homeCleaners);
    }

    public void addPaperGoods(PaperGoods paperGoods) {
        paperGoodsList.add(paperGoods);
    }

    public boolean removePaperGoods(PaperGoods paperGoods) {
        return paperGoodsList.remove(paperGoods);
    }

    public void addHomeCare(HomeCare homeCare) {
        homeCareList.add(homeCare);
    }

    public boolean removeHomeCare(HomeCare homeCare) {
        return homeCareList.remove(homeCare);
    }
    public void viewBread()
    {
        beveragesStack.viewAllElements();
    }
    public void addVendor(Vendor vendor)
    {
        vendorMap.put(vendor.getVendorId() + "", vendor);
    }
    public void removeVendor(Vendor vendor)
    {
        vendorMap.remove(vendor.getVendorId() + "");
    }

    public void addBill(Bill bill)
    {
        billList.add(bill);
    }
    public void removeBill(Bill bill)
    {
        billList.remove(bill);
    }
    public void addIssuedGood(IssuedGoods good)
    {
        issuedGoodsMap.put(good.getItemID() +"", good);
    }
    public void removeIssuedGood(IssuedGoods good)
    {
        issuedGoodsMap.remove(good.getItemID() +"", good);
    }


    public void addProduct(Product product, String category) {
        switch (category) {
            case "Beverages":
                addBeverage((Beverages) product);
                break;
            case "Bread/Bakery":
                addBread((Bread) product);
                break;
            case "Canned/Jarred Goods":
                addCannedGoods((CannedGoods) product);
                break;
            case "Dairy Products":
                addDairyProducts((DairyProducts) product);
                break;
            case "Dry/Baking Goods":
                addDryGoods((DryGoods) product);
                break;
            case "Frozen Products":
                addFrozenProducts((FrozenProducts) product);
                break;
            case "Meat":
                addMeat((Meat) product);
                break;
            case "Farm Produce":
                addFarmProduce((FarmProduce) product);
                break;
            case "Home Cleaners":
                addHomeCleaners((HomeCleaners) product);
                break;
            case "Paper Goods":
                addPaperGoods((PaperGoods) product);
                break;
            case "Home Care":
                addHomeCare((HomeCare) product);
                break;
            default:
                // Handle unknown category or display an error message
                break;
        }
    }

    public Product removeProduct(Product product, String category) {
        switch (category) {
            case "Beverages":
                return removeBeverage();
            case "Bread/Bakery":
                return removeBread();
            case "Canned/Jarred Goods":
                return removeCannedGoods();
            case "Dairy Products":
                return removeDairyProducts();
            case "Dry/Baking Goods":
                return removeDryGoods();
            case "Frozen Products":
                return removeFrozenProducts();
            case "Meat":
            case "Farm Produce":
                removeFarmProduce((FarmProduce) product);
                return (FarmProduce) product;
            case "Home Cleaners":
                removeHomeCleaners((HomeCleaners) product);
                return (HomeCleaners) product;
            case "Paper Goods":
                removePaperGoods((PaperGoods) product);
                return (PaperGoods) product;
            case "Home Care":
                removeHomeCare((HomeCare) product);
                return (HomeCare) product;
            default:
                // Handle unknown category or display an error message
                return null;
        }
    }
}

