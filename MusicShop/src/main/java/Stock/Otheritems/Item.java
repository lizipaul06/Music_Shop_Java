package Stock.Otheritems;

public abstract class Item implements ISell{

   private double cost;
   private double sellingPrice;
   private String type;

    public Item(double cost, double sellingPrice, String type){
        this.cost = cost;
        this.sellingPrice = sellingPrice;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculateMarkup() {
        return  (sellingPrice - cost)/cost * 100;
    }
}
