package Instruments;

import Behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int valves;

    public Trumpet(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, int valves) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play(){
        return "Voum voumm";
    }
}
