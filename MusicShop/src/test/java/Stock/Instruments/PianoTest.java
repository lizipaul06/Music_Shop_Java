package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Plastic", "Blue", InstrumentType.Percussion, 200,300);
    }

    @Test
    public void canGetMaterial() {
            assertEquals("Plastic", piano.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        piano.setMaterial("Metal");
        assertEquals("Metal", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Blue", piano.getColour());
    }

    @Test
    public void canSetColour() {
        piano.setColour("Purple");
        assertEquals("Purple", piano.getColour());
    }
    @Test
    public void canGetType() {
        assertEquals(InstrumentType.Percussion, piano.getType());
    }


    @Test
    public void canGetCost() {
        assertEquals(200, piano.getCost(), 0.01);
    }

    @Test
    public void canSetCost() {
        piano.setCost(250);
        assertEquals(250, piano.getCost(), 0.01);
    }
    @Test
    public void canGetSellingPrice() {
        assertEquals(300, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice() {
        piano.setSellingPrice(340);
        assertEquals(340, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {

        assertEquals(50, piano.calculateMarkup(), 0.01);
    }
}
