package productScanner;

import DataInMemory.InMemoryProduct;
import model.ProductEntity;

import java.util.HashMap;

public class ScannerManager {
    //InMemoryProduct inMemoryProduct = new InMemoryProduct();

    Integer newBarCode;

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();

    public ScannerManager(Integer newBarCode, HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.newBarCode = newBarCode;
        this.inMemoryProductMap = inMemoryProductMap;
    }

    public boolean checkIfCodeExist() {
        return inMemoryProductMap.containsKey(newBarCode);
    }




}
