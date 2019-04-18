import model.ProductEntity;
import model.ReceiptEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import productScanner.ScannerManager;

import java.util.HashMap;

public class ScannerTest {
    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ReceiptEntity receiptEntity = new ReceiptEntity();

    @Before
    public void generateDefaultProductsMap(){
        inMemoryProductMap.put(1,new ProductEntity("Coffee",2.99,1));
        inMemoryProductMap.put(2,new ProductEntity("Chips",1.99,2));
        inMemoryProductMap.put(3,new ProductEntity("Water",0.99,3));
    }

    @Test
    public void shouldCheckIfCodeExist(){

        Integer a = null;
        Integer b = 1;
        Integer c = 100;

        ScannerManager scannerManager = new ScannerManager(b,inMemoryProductMap);
        Assert.assertTrue(scannerManager.checkIfCodeExist(b,inMemoryProductMap));
    }

   /* @Test
    public void shouldAddToReceiptIfCodeExist(){
        ScannerManager scannerManager = new ScannerManager(,inMemoryProductMap);
        receiptEntity.getReceipt()=
    }*/

}



/*












 */
