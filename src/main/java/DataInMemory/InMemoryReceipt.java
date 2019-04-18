package DataInMemory;

import model.ProductEntity;
import model.ReceiptEntity;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InMemoryReceipt {
    List<ProductEntity> receipt = new ArrayList<ProductEntity>();


    public void saveToReceipt(ProductEntity productEntity) {

        receipt.add(productEntity);
    }

    public void readReceipt() {

        System.out.println(Arrays.toString(receipt.toArray()));
    }
}
