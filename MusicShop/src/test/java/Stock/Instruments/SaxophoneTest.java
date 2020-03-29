package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Brass", "Gold", InstrumentType.Woodwind, 150,170);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        saxophone.setMaterial("Metal");
        assertEquals("Metal", saxophone.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void canSetColour() {
        saxophone.setColour("Purple");
        assertEquals("Purple", saxophone.getColour());
    }
    @Test
    public void canGetType() {
        assertEquals(InstrumentType.Woodwind, saxophone.getType());
    }


    @Test
    public void canGetCost() {
        assertEquals(150, saxophone.getCost(), 0.01);
    }

    @Test
    public void canSetCost() {
        saxophone.setCost(200);
        assertEquals(200, saxophone.getCost(), 0.01);
    }
    @Test
    public void canGetSellingPrice() {
        assertEquals(170, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice() {
        saxophone.setSellingPrice(200);
        assertEquals(200, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {

        assertEquals(13.33, saxophone.calculateMarkup(), 0.01);
    }
}
