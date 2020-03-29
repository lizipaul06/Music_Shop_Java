package Stock.OtherItems;

import Stock.Otheritems.DrumSticks;
import Stock.Otheritems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(20 ,30, "Paper to write music");
    }

    @Test
    public void canGetCost(){
        assertEquals(20, sheetMusic.getCost(), 0.01);
    }

    @Test
    public void canSetCost(){
        sheetMusic.setCost(35);
        assertEquals(35, sheetMusic.getCost(),0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(30, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        sheetMusic.setSellingPrice(50);
        assertEquals(50, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Paper to write music", sheetMusic.getType());
    }

    @Test
    public void canSetType(){
        sheetMusic.setType("Musical paper");
        assertEquals("Musical paper", sheetMusic.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, sheetMusic.calculateMarkup(), 0.01);
    }

}
