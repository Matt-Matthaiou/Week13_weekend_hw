package MainShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private static Shop instance = null;

    private ArrayList<ISell> stock;

    private Shop(){
        stock = new ArrayList<>();
    }

    public static Shop getInstance(){
        if (instance == null){
            instance = new Shop();
        }
        return instance;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public int stockSize(){
        return stock.size();
    }

    public ISell getItem(ISell item){
        return stock.get(stock.indexOf(item));
    }

}
