package domain;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void update() {
        System.out.println("Nieuwe rekening geopend op datum … met nummer… en saldo …");
    }
}
