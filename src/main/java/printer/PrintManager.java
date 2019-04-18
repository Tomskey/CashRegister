package printer;

import DataInMemory.InMemoryReceipt;
import model.ProductEntity;
import model.ReceiptEntity;
import productScanner.ScannerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintManager {



    List<ProductEntity> products;


    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    Integer barCode;

    ScannerManager scannerManager;
    public PrintManager(HashMap<Integer, ProductEntity> inMemoryProductMap, Integer barCode, ScannerManager scannerManager) {

        this.inMemoryProductMap = inMemoryProductMap;
        this.barCode = barCode;
        this.scannerManager = scannerManager;
    }

    public PrintManager() {
    }

    public PrintManager(ScannerManager scannerManager) {
        this.scannerManager = scannerManager;
    }


    public void printReceipt(){
        for(String product: scannerManager.getReceipt())
        System.out.println(product);

        System.out.println("Total Sum: " + scannerManager.getTotalSum().toString());

    }
}
