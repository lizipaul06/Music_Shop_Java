package Stock.Instruments;

import Stock.Otheritems.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
   private double cost;
    private double sellingPrice;


    public Instrument(String material, String colour, InstrumentType type, double cost, double sellingPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.cost = cost;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
       return  (sellingPrice - cost)/cost * 100;
    }
}
