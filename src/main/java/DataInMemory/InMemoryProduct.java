package DataInMemory;

import java.util.HashMap;
import model.ProductEntity;

public class InMemoryProduct {

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();


    public InMemoryProduct(HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.inMemoryProductMap = inMemoryProductMap;
    }

    public void defaultProductMap(){


    }

    public void saveToMap(Integer barCode, ProductEntity product) {

        inMemoryProductMap.put(barCode,product);
    }

    public ProductEntity readFromMap(Integer barCode) {

         return inMemoryProductMap.get(barCode);
    }

    public boolean checkIfCodeExist(Integer barCode) {
        return inMemoryProductMap.containsKey(barCode);
    }
}
