import display.DisplayManager;
import model.ProductEntity;
import org.junit.Before;
import org.junit.Test;
import productScanner.ScannerManager;

import java.util.HashMap;

public class DisplayerTest {

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ScannerManager scannerManager = new ScannerManager();
    DisplayManager displayManager = new DisplayManager(scannerManager);

    @Before
    public void generateDefaultProductsMap() {
        inMemoryProductMap.put(1, new ProductEntity("Coffee", 2.99, 1));
        inMemoryProductMap.put(2, new ProductEntity("Chips", 1.99, 2));
        scannerManager.setScannerMemory(inMemoryProductMap);
        scannerManager.countTotalSum(1);
        scannerManager.countTotalSum(2);
    }

    @Test
    public void shouldDisplayProductFromMap() {
        displayManager.displayProductDetails(1);
    }

    @Test
    public void shouldDisplayTotalSum() {
        displayManager.displayTotalSum();
    }

}
