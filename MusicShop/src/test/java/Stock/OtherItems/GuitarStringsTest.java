package Stock.OtherItems;

import Stock.Otheritems.DrumSticks;
import Stock.Otheritems.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5 ,10, "Metal guitar strings");
    }

    @Test
    public void canGetCost(){
        assertEquals(5, guitarStrings.getCost(), 0.01);
    }

    @Test
    public void canSetCost(){
        guitarStrings.setCost(8);
        assertEquals(8, guitarStrings.getCost(),0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(10, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        guitarStrings.setSellingPrice(12);
        assertEquals(12, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Metal guitar strings", guitarStrings.getType());
    }

    @Test
    public void canSetType(){
        guitarStrings.setType("Strings that sing");
        assertEquals("Strings that sing", guitarStrings.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, guitarStrings.calculateMarkup(), 0.01);
    }

}
