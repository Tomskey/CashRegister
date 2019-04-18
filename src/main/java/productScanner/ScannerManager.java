package productScanner;

import DataInMemory.InMemoryProduct;
import model.ProductEntity;
import model.ReceiptEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ScannerManager {
    //InMemoryProduct inMemoryProduct = new InMemoryProduct();

    Integer newBarCode;

    ReceiptEntity receiptEntity = new ReceiptEntity();

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();



    Double totalSum = 0.0;

    List<String> receipt;

    public List<String> getReceipt() {
        return receipt;
    }

    public ScannerManager(Integer newBarCode, HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.newBarCode = newBarCode;
        this.inMemoryProductMap = inMemoryProductMap;
    }

    public ScannerManager() {
    }

    public boolean checkIfCodeExist(Integer newBarCode, HashMap<Integer, ProductEntity> inMemoryProductMap) {
        return inMemoryProductMap.containsKey(newBarCode);
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public void makeReceipt() {
        receipt = new ArrayList<String>();

    }

    public void countTotalSum( Integer barCode,HashMap<Integer, ProductEntity> inMemoryProductMap){
        ProductEntity tempProduct = inMemoryProductMap.get(barCode);
        totalSum += tempProduct.getPrice();

    }

    public void addProductToReceiptIfCodeExist(Integer barCode,
                                               HashMap<Integer, ProductEntity> inMemoryProductMap){

        ProductEntity tempProduct = inMemoryProductMap.get(barCode);
        String tempString = "Name: " + tempProduct.getName() + " Price: " + tempProduct.getPrice().toString();
        receipt.add(tempString);
    }

}
