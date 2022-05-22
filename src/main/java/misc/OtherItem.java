package misc;

import Behaviours.ISell;

public class OtherItem implements ISell {

    private String description;
    private String brand;
    private String model;
    private double buyingPrice;
    private double sellingPrice;

    public OtherItem(String description, String brand, String model, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.brand = brand;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return sellingPrice - buyingPrice;
    }
}
