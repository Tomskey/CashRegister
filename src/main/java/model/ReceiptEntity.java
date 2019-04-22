package model;

import java.util.ArrayList;
import java.util.List;

public class ReceiptEntity {


    List<String> receipt = new ArrayList<String>();

    public List<String> getReceipt() {
        return receipt;
    }

    public void addProduct(String product) {
        receipt.add(product);
    }


}
