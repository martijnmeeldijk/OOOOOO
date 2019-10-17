package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Auditor implements Observer {
    Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
        bank.addObserver(this);
    }

    @Override
    public void update(LinkedHashMap<String, Rekening> rekeningen) {
        Collection<Rekening> test=  rekeningen.values();
        ArrayList<Rekening>test1= new ArrayList<>();
        test1.addAll(test);
        System.out.println("-----AUDITOR-----");

        System.out.println("Nieuwe rekening geopend op: " + LocalDate.now().getDayOfMonth() + " " +  LocalDate.now().getMonth() + " " +
        + LocalDate.now().getYear());
        System.out.println("Met nummer: "+test1.get(test1.size()-1).getNummer());
        System.out.println("Met Saldo: "+test1.get(test1.size()-1).getSaldo());

        /*
        System.out.println("Nummer " + rekening1.getNummer() + "\nsaldo= " + rekening1.getSaldo() +"\n"+ LocalDateTime.now().toString());
        System.out.println("Het aantal rekeningen = " + test.size());

         */


    }
}
