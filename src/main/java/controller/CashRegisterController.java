package controller;

import display.DisplayManager;
import model.ProductEntity;
import model.ReceiptEntity;
import printer.PrintManager;
import productScanner.ScannerManager;

import java.util.HashMap;
import java.util.Scanner;

public class CashRegisterController {

    Integer barCode = 0;

    HashMap<Integer, ProductEntity> inMemoryProductMap = new HashMap<Integer, ProductEntity>();


    public CashRegisterController(Integer barCode, HashMap<Integer, ProductEntity> inMemoryProductMap) {
        this.barCode = barCode;
        this.inMemoryProductMap = inMemoryProductMap;
    }



   /* public void CashRegisterFunctionality(Integer barCode) {


        ReceiptEntity receiptEntity;
        ScannerManager scannerManager = new ScannerManager(barCode, inMemoryProductMap);
        DisplayManager displayManager = new DisplayManager();
        PrintManager printManager = new PrintManager();
         barCode = 1;
        boolean exit = false;
        while (exit == false) {

            if (scannerManager.checkIfCodeExist(barCode)) {
                displayManager.displayProductDetails(barCode,inMemoryProductMap);
                displayManager.displayTotalPrice();
                printManager.addProductToReceipt(receiptEntity);
            } else System.out.println("Product not found");

            System.out.println("End of Transaction?");
            if(true){

                printManager.printReceipt();
                exit = true;
            }

        }
    }*/

}
