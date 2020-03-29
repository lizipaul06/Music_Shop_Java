package Stock.OtherItems;

import Stock.Otheritems.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(20 ,30, "Wooden Sticks");
    }

    @Test
    public void canGetCost(){
        assertEquals(20, drumSticks.getCost(), 0.01);
    }

    @Test
    public void canSetCost(){
        drumSticks.setCost(35);
        assertEquals(35, drumSticks.getCost(),0.01);
    }

    @Test
    public void canGetSellingPrice(){
      assertEquals(30, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        drumSticks.setSellingPrice(50);
        assertEquals(50, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Wooden Sticks", drumSticks.getType());
    }

    @Test
    public void canSetType(){
        drumSticks.setType("Sticks for a drum set");
        assertEquals("Sticks for a drum set", drumSticks.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, drumSticks.calculateMarkup(), 0.01);
    }

}




