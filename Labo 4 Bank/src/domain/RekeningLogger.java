package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class RekeningLogger implements Observer{
    Bank bank;
    public RekeningLogger(Bank bank) {
        this.bank = bank;
        bank.addObserver(Actie.AANMAKEN,this);
    }


    @Override
    public void update(LinkedHashMap<String, Rekening> rekeningen) {
        Collection<Rekening> test=  rekeningen.values();
        ArrayList<Rekening>test1= new ArrayList<>();
        test1.addAll(test);
        System.out.println("-----LOGGER-----");
        System.out.println("Aantal rekeningen: " + test1.size());
        System.out.println("Rekeningnummer laatste: "+test1.get(test1.size()-1).getSaldo());
    }
}
