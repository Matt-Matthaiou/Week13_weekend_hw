package Instruments;

import Behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private String type;
    private String colour;
    private String brand;
    private String model;
    private double sellingPrice;
    private double buyingPrice;

    public Instrument(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice) {
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double calculateMarkup(){
        return sellingPrice - buyingPrice;
    }
}
