package domain;

import java.util.*;


public class Bank implements Subject {
    private Map<Actie,ArrayList<Observer>> observers;
    private LinkedHashMap<String, Rekening> lijst;

    public Bank(LinkedHashMap<String, Rekening> lijst) {
        this.lijst = lijst;
        observers = new HashMap();
    }

    public Bank(){
        this.lijst = new LinkedHashMap<>();
        observers = new HashMap<>();
        observers.put(Actie.AANMAKEN, new ArrayList<Observer>());
        observers.put(Actie.OPHALEN, new ArrayList<Observer>());
        observers.put(Actie.STORTEN, new ArrayList<Observer>());
    }

    public void openRekening(Rekening rekening){
        if(rekening == null || rekening.getNummer() == null) throw new IllegalArgumentException("geen rekening meegegeven");

        lijst.put(rekening.getNummer(), rekening);
        notifyObserver(rekening);
    }

    public Rekening getRekening(String nummer){
        if(lijst.get(nummer) == null) throw new IllegalArgumentException("rekening bestaat niet");

        return lijst.get(nummer);
    }


    @Override
    public void addObserver(Actie type, Observer observer) {
        if(observer == null) throw new IllegalArgumentException("geen observer meegegeven");
        observers.get(type).add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null) throw new IllegalArgumentException("geen observer meegegeven");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Rekening rekening) {
        Set<Actie>keys=observers.keySet();
        for(Actie a : keys){
            for(Observer o :observers.get(a))
            o.update(lijst);
        }
    }
}


