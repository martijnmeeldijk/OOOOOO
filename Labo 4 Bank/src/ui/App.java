package ui;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;
import domain.RekeningLogger;

public class App {
    public static void main(String[]args){
        
    Bank bank = new Bank();
    Rekening rekening = new Rekening("9/11", 420);
    Rekening rekening2 = new Rekening("1234SZE", 3214);
    Rekening rekening3 = new Rekening("aerglkjaerg", 12341234);

    Auditor auditor = new Auditor(bank);
    RekeningLogger logger = new RekeningLogger(bank);
    bank.openRekening(rekening);
    bank.openRekening(rekening2);
    bank.openRekening(rekening3);




    }
}
