package DataInMemory;

import java.util.HashMap;
import model.ProductEntity;

public class InMemoryProduct {

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();


    public InMemoryProduct(HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.inMemoryProductMap = inMemoryProductMap;
    }

}
