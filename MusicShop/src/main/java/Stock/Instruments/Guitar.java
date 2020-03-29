package Stock.Instruments;

public class Guitar extends Instrument{
    public Guitar(String material, String colour, InstrumentType type, double cost, double sellingPrice) {
        super(material, colour, type, cost, sellingPrice);
    }

    public String play() {
        return "Kurt vibes";
    }


}
