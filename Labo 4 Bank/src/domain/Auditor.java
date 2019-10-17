package domain;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void update(Rekening rekening) {
        bank.getRekening(rekening.getNummer());
    }
}
