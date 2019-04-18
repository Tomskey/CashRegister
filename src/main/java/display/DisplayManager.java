package display;

import model.ProductEntity;
import printer.PrintManager;


import java.util.HashMap;


public class DisplayManager {


    ProductEntity productEntity = new ProductEntity();
    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    Integer barCode;

    public DisplayManager(HashMap<Integer, ProductEntity> inMemoryProductMap, Integer barCode) {
        this.inMemoryProductMap = inMemoryProductMap;
        this.barCode = barCode;
    }


    public String displayProductDetails(){
        ProductEntity productEntity = new ProductEntity();
        productEntity = inMemoryProductMap.get(barCode);

        return "Name: " + productEntity.getName() + " Price: " + productEntity.getPrice().toString();

    }

    public String displayTotalPrice(){
        PrintManager printManager = new PrintManager();
        return printManager.totalSum();
    }



    /*public void setTotalPrice(){
        sumPrice+=productEntity.getPrice();
    }


    }*/

}
