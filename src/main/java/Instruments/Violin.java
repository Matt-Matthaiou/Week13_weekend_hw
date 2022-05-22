package Instruments;

import Behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private String size;
    private double weight;

    public Violin(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, String size, double weight) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String play(){
        return "iiiiin iiiiim";
    }
}
