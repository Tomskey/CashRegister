import display.DisplayManager;
import model.ProductEntity;
import org.junit.Before;
import org.junit.Test;
import printer.PrintManager;
import productScanner.ScannerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntegrationTest {

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();
    ScannerManager scannerManager = new ScannerManager();
    DisplayManager displayManager = new DisplayManager(scannerManager);
    PrintManager printManager = new PrintManager(scannerManager);

    List<String> receipt;




    @Before
    public void setUp(){
        inMemoryProductMap.put(1,new ProductEntity("Coffee",2.99,1));
        inMemoryProductMap.put(2,new ProductEntity("Chips",1.99,2));
        inMemoryProductMap.put(3,new ProductEntity("Water",0.99,3));
    }


    @Test
    public void shouldPrintFullReceipt() {

        Integer[] barCode = new Integer[3];
        barCode[0] = 1;
        barCode[1] = 2;
        barCode[2] = 3;

        scannerManager.makeReceipt();
        for(int i = 0; i<3 ; i++) {
            if (scannerManager.checkIfCodeExist(barCode[i],inMemoryProductMap)) {
                scannerManager.countTotalSum(barCode[i], inMemoryProductMap);
                scannerManager.addProductToReceiptIfCodeExist(barCode[i],inMemoryProductMap);
                displayManager.displayProductDetails(barCode[i], inMemoryProductMap);
            } else System.out.println("Product not found");

            System.out.println("End of Transaction?");
            if (i == 2) {
                printManager.printReceipt();
            }
        }
    }

    @Test
    public void shouldPrintReceiptWithOneWrongBarCode(){

    }



}
