package ui;

import domain.Bank;
import domain.Rekening;

public class App {
    public static void main(String[]args){
        
    Bank bank = new Bank();
    Rekening rekening = new Rekening("9/11", 420);
    bank.openRekening(rekening);




    }
}
