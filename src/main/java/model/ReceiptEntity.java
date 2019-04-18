package model;

import java.util.List;

public class ReceiptEntity {

    List<ProductEntity> products;

    Double totalPrice;

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
}
