package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int strings;
    private int neckLength;
    private String guitarType;


    public Guitar(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, int strings, int neckLength, String guitarType) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.strings = strings;
        this.neckLength = neckLength;
        this.guitarType = guitarType;
    }

    public int getStrings() {
        return strings;
    }

    public int getNeckLength() {
        return neckLength;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play(){
        return "tiririritiriritiriri";
    }
}
