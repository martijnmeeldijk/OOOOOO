package domain;

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
        System.out.println("Lengte= " + test1.size()+"\n");
        System.out.println("Salde laatste= "+test1.get(test1.size()-1).getSaldo());

        /*
        System.out.println("Nummer " + rekening1.getNummer() + "\nsaldo= " + rekening1.getSaldo() +"\n"+ LocalDateTime.now().toString());
        System.out.println("Het aantal rekeningen = " + test.size());

         */


    }
}
