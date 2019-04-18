import model.ProductEntity;
import model.ReceiptEntity;
import org.junit.Before;
import org.junit.Test;
import printer.PrintManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrinterTest {
    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    PrintManager printManager = new PrintManager();

    @Before
    public void generateDefaultProductsMap(){
        inMemoryProductMap.put(1,new ProductEntity("Coffee",2.99,1));
        inMemoryProductMap.put(2,new ProductEntity("Chips",1.99,2));
        inMemoryProductMap.put(3,new ProductEntity("Water",0.99,3));
    }

    @Test
    public void shouldAddProductToReceiptList(){


    }
}
