import display.DisplayManager;
import model.ProductEntity;
import org.junit.Before;
import org.junit.Test;
import printer.PrintManager;
import productScanner.ScannerManager;


import java.util.HashMap;


public class IntegrationTest {


    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ScannerManager scannerManager = new ScannerManager();
    DisplayManager displayManager = new DisplayManager(scannerManager);
    PrintManager printManager = new PrintManager(scannerManager);
    boolean exit = false;


    @Before
    public void setUp() {
        inMemoryProductMap.put(1, new ProductEntity("Coffee", 2.99, 1));
        inMemoryProductMap.put(2, new ProductEntity("Chips", 1.99, 2));
        inMemoryProductMap.put(3, new ProductEntity("Water", 0.99, 3));
        scannerManager.setScannerMemory(inMemoryProductMap);
    }


    @Test
    public void shouldPrintFullReceipt() {

        Integer[] barCode = new Integer[3];
        barCode[0] = 1;
        barCode[1] = 2;
        barCode[2] = 3;

        scannerManager.makeReceipt();
        for (int i = 0; i < 3; i++) {
            if (scannerManager.checkIfCodeExist(barCode[i])) {
                scannerManager.countTotalSum(barCode[i]);
                displayManager.displayProductDetails(barCode[i]);
                displayManager.displayTotalSum();
                scannerManager.addProductToReceipt(barCode[i]);
            } else System.out.println("Product not found");

            if (i == 2) {
                printManager.printReceipt();
            }
        }
    }

    @Test
    public void shouldPrintReceiptWithOneWrongBarCode() {
        Integer[] barCodes = new Integer[3];
        barCodes[0] = 1;
        barCodes[1] = 2;
        barCodes[2] = 4;

        scannerManager.makeReceipt();
        for (int i = 0; i < barCodes.length; i++) {
            if (scannerManager.checkIfCodeExist(barCodes[i])) {
                scannerManager.countTotalSum(barCodes[i]);
                displayManager.displayProductDetails(barCodes[i]);
                displayManager.displayTotalSum();
                scannerManager.addProductToReceipt(barCodes[i]);
            } else System.out.println("Product not found");


            if (i == barCodes.length - 1) {
                printManager.printReceipt();
            }
        }


    }

    @Test
    public void shouldPrintReceiptWithExitInput() {
        Integer[] barCodes = new Integer[3];
        barCodes[0] = 1;
        barCodes[1] = 2;
        barCodes[2] = 4;

        scannerManager.makeReceipt();
        for (int i = 0; i < barCodes.length; i++) {
            if (scannerManager.checkIfCodeExist(barCodes[i])) {
                scannerManager.countTotalSum(barCodes[i]);
                displayManager.displayProductDetails(barCodes[i]);
                displayManager.displayTotalSum();
                scannerManager.addProductToReceipt(barCodes[i]);
            } else System.out.println("Product not found");

            System.out.println("End of Transaction?");
            if (i == 1) exit = true;

            if (i == barCodes.length - 1 || exit == true) {
                printManager.printReceipt();
            }
        }

    }

}
