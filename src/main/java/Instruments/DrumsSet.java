package Instruments;

import Behaviours.IPlay;

public class DrumsSet extends Instrument implements IPlay {

    private int pieces;
    private boolean electric;
    private String piecesDescription;

    public DrumsSet(String material, String type, String colour, String brand, String model, double sellingPrice, double buyingPrice, int pieces, boolean electric, String piecesDescription) {
        super(material, type, colour, brand, model, sellingPrice, buyingPrice);
        this.pieces = pieces;
        this.electric = electric;
        this.piecesDescription = piecesDescription;
    }

    public int getPieces() {
        return pieces;
    }

    public boolean isElectric() {
        return electric;
    }

    public String getPiecesDescription() {
        return piecesDescription;
    }

    public String play(){
        return "Tu pap tu tu pap";
    }
}
