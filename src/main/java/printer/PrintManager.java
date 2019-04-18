package printer;

import DataInMemory.InMemoryReceipt;
import model.ProductEntity;
import model.ReceiptEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintManager {



    List<ProductEntity> products;


    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    Integer barCode;

    public PrintManager(HashMap<Integer, ProductEntity> inMemoryProductMap, Integer barCode) {

        this.inMemoryProductMap = inMemoryProductMap;
        this.barCode = barCode;
    }

    public PrintManager() {
    }

    public List<ProductEntity> addProductToReceipt(Integer scanCode){
         products.add(inMemoryProductMap.get(scanCode));
         return products;
    }

    public String totalSum(){
        Double sum = 0.0;
        for (ProductEntity productEntity : products){
            sum += productEntity.getPrice();
        }
        return sum.toString();
    }


    public List<String> printReceipt(){
        List<String> receipt = new ArrayList<String>();
        for (ProductEntity productEntity : products){
            receipt.add("Name: " + productEntity.getName() + " Price: " + productEntity.getPrice().toString());
        }
        receipt.add("Total Sum: " + totalSum());
        return receipt;

    }
}
