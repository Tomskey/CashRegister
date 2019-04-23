package printer;


import productScanner.ScannerManager;


public class PrintManager {


    ScannerManager scannerManager;


    public PrintManager(ScannerManager scannerManager) {
        this.scannerManager = scannerManager;
    }


    public void printReceipt() {
        System.out.println("RECEIPT");
        for (String product : scannerManager.getReceiptFromEntity())
            System.out.println(product);

        System.out.println("Total Sum: " + scannerManager.getTotalSum().toString());

    }
}
