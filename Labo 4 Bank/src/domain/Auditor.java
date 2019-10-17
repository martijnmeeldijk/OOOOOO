package domain;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
        bank.addObserver(this);
    }

    @Override
    public void update(LinkedHashMap<String, Rekening> rekeningen) {
        Object[] rekeningen1 = rekeningen.entrySet().toArray();
        Rekening rekening1 =(Rekening) rekeningen1[rekeningen1.length -1];
        System.out.println("Nummer " + rekening1.getNummer() + "\nsaldo= " + rekening1.getSaldo() +"\n"+ LocalDateTime.now().toString());
    }
}
