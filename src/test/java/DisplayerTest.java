import display.DisplayManager;
import model.ProductEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class DisplayerTest {

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();

    @Before
    public void generateDefaultProductsMap() {
        inMemoryProductMap.put(1, new ProductEntity("Coffee", 2.99, 1));
    }

    @Test
    public void shouldDisplayProductFromMap(){
        DisplayManager displayManager = new DisplayManager(inMemoryProductMap,1);
        System.out.println(displayManager.displayProductDetails());
    }

}
