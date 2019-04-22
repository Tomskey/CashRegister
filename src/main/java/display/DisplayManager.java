package display;

import model.ProductEntity;
import printer.PrintManager;
import productScanner.ScannerManager;


import java.util.HashMap;


public class DisplayManager {

    ScannerManager scannerManager;


    public DisplayManager() {
    }

    public DisplayManager(ScannerManager scannerManager) {
        this.scannerManager = scannerManager;
    }


    public void displayProductDetails(Integer barCode) {
        ProductEntity productEntity;
        productEntity = scannerManager.getInMemoryProductMap().get(barCode);

        System.out.println("Name: " + productEntity.getName() + " Price: " + productEntity.getPrice().toString());

    }

    public void displayTotalSum() {

        System.out.println("Total Sum: " + scannerManager.getTotalSum().toString());
    }


}
