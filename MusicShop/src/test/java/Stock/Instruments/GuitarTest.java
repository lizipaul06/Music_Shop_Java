package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Brown", InstrumentType.Stringed, 12,14);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        guitar.setMaterial("Metal");
        assertEquals("Metal", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void canSetColour() {
        guitar.setColour("Purple");
        assertEquals("Purple", guitar.getColour());
    }
    @Test
    public void canGetType() {
        assertEquals(InstrumentType.Stringed, guitar.getType());
    }


    @Test
    public void canGetCost() {
        assertEquals(12, guitar.getCost(), 0.01);
    }

    @Test
    public void canSetCost() {
        guitar.setCost(10);
        assertEquals(10, guitar.getCost(), 0.01);
    }
    @Test
    public void canGetSellingPrice() {
        assertEquals(14, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice() {
        guitar.setSellingPrice(16);
        assertEquals(16, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {

        assertEquals(16.66, guitar.calculateMarkup(), 0.01);
    }
}




