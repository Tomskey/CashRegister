import model.ProductEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import productScanner.ScannerManager;

import java.util.HashMap;

public class ScannerTest {
    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ScannerManager scannerManager = new ScannerManager();
    boolean flag = false;

    @Before
    public void generateDefaultProductsMap() {
        inMemoryProductMap.put(1, new ProductEntity("Coffee", 2.99, 1));
        inMemoryProductMap.put(2, new ProductEntity("Chips", 1.99, 2));
        inMemoryProductMap.put(3, new ProductEntity("Water", 0.99, 3));
        scannerManager.setScannerMemory(inMemoryProductMap);

    }

    @Test
    public void shouldCheckIfCodeExistTrue() {
        Integer b = 1;
        Assert.assertTrue(scannerManager.checkIfCodeExist(b));
    }

    @Test
    public void shouldCheckIfCodeExistFalse() {
        Integer b = 100;
        Assert.assertFalse(scannerManager.checkIfCodeExist(b));
    }

    @Test
    public void shouldCountTotalSum() {
        scannerManager.countTotalSum(1);
        scannerManager.countTotalSum(2);
        if (scannerManager.getTotalSum() == 4.98)
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void shouldAddProductToReceipt() {
        ProductEntity productEntity = new ProductEntity("Coffee", 2.99, 1);
        scannerManager.makeReceipt();
        scannerManager.addProductToReceipt(1);
        Assert.assertEquals(productEntity.getName(), inMemoryProductMap.get(1).getName());
    }


}



/*












 */
