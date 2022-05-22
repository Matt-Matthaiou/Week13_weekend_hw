package Instruments;

import Behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private int keys;
    private String soundType;


    public Keyboard(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, int keys, String soundType) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.keys = keys;
        this.soundType = soundType;
    }

    public int getKeys() {
        return keys;
    }

    public String getSoundType() {
        return soundType;
    }

    public String play(){
        return "nanana nana nana";
    }
}
