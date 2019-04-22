import model.ProductEntity;
import org.junit.Before;
import org.junit.Test;
import printer.PrintManager;
import productScanner.ScannerManager;

import java.util.HashMap;

public class PrinterTest {
    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ScannerManager scannerManager = new ScannerManager();
    PrintManager printManager = new PrintManager(scannerManager);

    @Before
    public void generateDefaultProductsMap() {
        inMemoryProductMap.put(1, new ProductEntity("Coffee", 2.99, 1));
        inMemoryProductMap.put(2, new ProductEntity("Chips", 1.99, 2));
        inMemoryProductMap.put(3, new ProductEntity("Water", 0.99, 3));
        scannerManager.setScannerMemory(inMemoryProductMap);
        scannerManager.makeReceipt();
        scannerManager.addProductToReceipt(1);
        scannerManager.addProductToReceipt(2);
        scannerManager.addProductToReceipt(3);

    }

    @Test
    public void shouldPrintReceipt() {
        printManager.printReceipt();
    }
}
