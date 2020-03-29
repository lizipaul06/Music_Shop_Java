package Stock.Instruments;

public class Piano extends Instrument{
    public Piano(String material, String colour, InstrumentType type, double cost, double sellingPrice) {
        super(material, colour, type, cost, sellingPrice);
    }

    public String play() {
        return "Mozart vibes";
    }

}
