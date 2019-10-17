package domain;

import java.time.LocalDateTime;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void update(Rekening rekening) {
        Rekening rekening1 = bank.getRekening(rekening.getNummer());
        System.out.println("Nummer " + rekening1.getNummer() + " saldo= " + rekening1.getSaldo() + LocalDateTime.now().toString());
    }
}
