import Behaviours.ISell;
import Instruments.BassGuitar;
import MainShop.Shop;
import misc.OtherItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    private Shop shop;
    private BassGuitar bass;
    OtherItem bassStrings;

    @Before
    public void before(){
        shop = Shop.getInstance();
        bass = new BassGuitar("rosewood","string", "walnut", "Musicman", "Stingray", 1100.99, 750.00,4,"electric",24,false);
        bassStrings = new OtherItem("Medium size bass strings", "Dadario", "Jazz", 5.00, 9.00);
    }

    @Test
    public void shopStartsWithEmptyStock(){
        assertEquals(0, shop.stockSize());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(bass);
        shop.addToStock(bassStrings);
        assertEquals(2, shop.stockSize());
        ISell letsTry = shop.getItem(bass);
        assertEquals("Boooom", letsTry.calculateMarkup());
    }
}
