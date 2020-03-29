package Stock;

import Stock.Otheritems.ISell;


import java.util.ArrayList;

public class Shop {


    ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public int getStockSize(){
       return stock.size();
    }

    public double shopProfit(){
        double total = 0;

        for(ISell item : stock){

            total += (item.getSellingPrice() * (item.calculateMarkup()/100));
        }

        return total;
    }

}
