package Instruments;

import Behaviours.IPlay;

public class BassGuitar extends Instrument implements IPlay {

    private int strings;
    private String bassGuitarType;
    private int frets;
    private boolean fretless;

    public BassGuitar(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, int strings, String bassGuitarType, int frets, boolean fretless) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.strings = strings;
        this.bassGuitarType = bassGuitarType;
        this.frets = frets;
        this.fretless = fretless;
    }

    public int getStrings() {
        return strings;
    }

    public String getBassGuitarType() {
        return bassGuitarType;
    }

    public int getFrets() {
        return frets;
    }

    public boolean isFretless() {
        return fretless;
    }

    public String play(){
        return "Boooom";
    }
}
