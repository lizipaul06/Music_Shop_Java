package Stock;

import Stock.Instruments.Guitar;
import Stock.Instruments.InstrumentType;
import Stock.Instruments.Saxophone;
import Stock.Otheritems.ISell;
import Stock.Otheritems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell item1;
    ISell item2;
    ISell item3;

    @Before
    public void before(){
        shop = new Shop();
        item1 = new Guitar("Wood", "Brown", InstrumentType.Stringed, 12,14);
        item2 = new SheetMusic(20 ,30, "Paper to write music");
        item3 = new Saxophone("Brass", "Gold", InstrumentType.Woodwind, 150,170);

    }

    @Test
    public void canAddStock(){
        shop.addToStock(item1);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(item1);
        shop.addToStock(item2);
        shop.addToStock(item3);
        assertEquals(3, shop.getStockSize());
        shop.removeFromStock(item1);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canCalculateProfit(){
        shop.addToStock(item1);
        shop.addToStock(item2);
        shop.addToStock(item3);
        assertEquals(40 , shop.shopProfit(), 0.01);
    }



}
