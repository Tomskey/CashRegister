package productScanner;


import repository.InMemoryProduct;
import model.ProductEntity;
import model.ReceiptEntity;

import java.util.HashMap;
import java.util.List;

public class ScannerManager {


    InMemoryProduct inMemoryProduct;

    Double totalSum = 0.0;

    ReceiptEntity receiptEntity;


    public List<String> getReceiptFromEntity() {
        return receiptEntity.getReceipt();
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public HashMap<Integer, ProductEntity> getInMemoryProductMap() {
        return inMemoryProduct.getInMemoryProductMap();
    }

    public void setScannerMemory(HashMap<Integer, ProductEntity> inMemoryProductMap) {
        inMemoryProduct = new InMemoryProduct(inMemoryProductMap);
    }

    public boolean checkIfCodeExist(Integer newBarCode) {
        return inMemoryProduct.getInMemoryProductMap().containsKey(newBarCode);
    }

    public void makeReceipt() {
        receiptEntity = new ReceiptEntity();
    }

    public void countTotalSum(Integer barCode) {
        ProductEntity tempProduct = inMemoryProduct.getProductFromMemory(barCode);
        totalSum += tempProduct.getPrice();
        totalSum = Math.round(totalSum * 100d) / 100d;
    }

    public void addProductToReceipt(Integer barCode) {
        ProductEntity tempProduct = inMemoryProduct.getProductFromMemory(barCode);
        String tempString = "Name: " + tempProduct.getName() + " | Price: " + tempProduct.getPrice().toString();
        receiptEntity.addProduct(tempString);
    }

}
