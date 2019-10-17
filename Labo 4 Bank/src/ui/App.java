package ui;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;

public class App {
    public static void main(String[]args){
        
    Bank bank = new Bank();
    Rekening rekening = new Rekening("9/11", 420);
    Auditor auditor = new Auditor(bank);
    bank.openRekening(rekening);




    }
}
