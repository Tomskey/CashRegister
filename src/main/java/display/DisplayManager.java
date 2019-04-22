package display;

import model.ProductEntity;
import printer.PrintManager;
import productScanner.ScannerManager;


import java.util.HashMap;


public class DisplayManager {



    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    Integer barCode;
    ScannerManager scannerManager;

    public DisplayManager(HashMap<Integer, ProductEntity> inMemoryProductMap, Integer barCode,
                          ScannerManager scannerManager) {
        this.inMemoryProductMap = inMemoryProductMap;
        this.barCode = barCode;
        this.scannerManager = scannerManager;
    }

    public DisplayManager() {
    }

    public DisplayManager(ScannerManager scannerManager) {
        this.scannerManager = scannerManager;
    }


    public void displayProductDetails(Integer barCode,HashMap<Integer, ProductEntity> inMemoryProductMap){
        ProductEntity productEntity;
        productEntity = inMemoryProductMap.get(barCode);

        System.out.println("Name: " + productEntity.getName() + " Price: " + productEntity.getPrice().toString());
        System.out.println("Total Sum: " + scannerManager.getTotalSum().toString());
    }


}
