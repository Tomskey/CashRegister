package model;

import java.util.HashMap;
import java.util.List;

public class ReceiptEntity {



    List<ProductEntity> products;

    Double totalPrice;

    public HashMap<Integer, ProductEntity> getReceipt() {
        return receipt;
    }

    HashMap<Integer, ProductEntity> receipt = new HashMap<Integer, ProductEntity>();


    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(ProductEntity productEntity) {
        products.add(productEntity);
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}
