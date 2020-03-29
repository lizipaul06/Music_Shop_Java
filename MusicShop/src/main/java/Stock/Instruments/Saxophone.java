package Stock.Instruments;

public class Saxophone extends Instrument{
    public Saxophone(String material, String colour, InstrumentType type, double cost, double sellingPrice) {
        super(material, colour, type, cost, sellingPrice);
    }

    public String play() {
        return "Jazz vibes";
    }


}
