package domain;

import java.time.LocalDateTime;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
        bank.addObserver(this);
    }

    @Override
    public void update(Rekening rekening) {
        Rekening rekening1 = bank.getRekening(rekening.getNummer());
        System.out.println("Nummer " + rekening1.getNummer() + "\nsaldo= " + rekening1.getSaldo() +"\n"+ LocalDateTime.now().toString());
    }
}
