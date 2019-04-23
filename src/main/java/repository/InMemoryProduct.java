package repository;

import java.util.HashMap;

import model.ProductEntity;

public class InMemoryProduct {


    HashMap<Integer, ProductEntity> inMemoryProductMap;

    public InMemoryProduct(HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.inMemoryProductMap = inMemoryProductMap;
    }


    public HashMap<Integer, ProductEntity> getInMemoryProductMap() {
        return inMemoryProductMap;
    }

    public void addToMemory(Integer newBarCode, ProductEntity productEntity) {
        inMemoryProductMap.put(newBarCode, productEntity);
    }

    public ProductEntity getProductFromMemory(Integer barCode) {
        return inMemoryProductMap.get(barCode);
    }

}
