package domain;

import java.util.*;


public class Bank implements Subject {
    private List<Observer> observers;
    private LinkedHashMap<String, Rekening> lijst;

    public Bank(LinkedHashMap<String, Rekening> lijst) {
        this.lijst = lijst;
        observers = new ArrayList<>();
    }

    public Bank(){
        this.lijst = new LinkedHashMap<>();
        observers = new ArrayList<>();
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
    public void addObserver(Observer observer) {
        if(observer == null) throw new IllegalArgumentException("geen observer meegegeven");

        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null) throw new IllegalArgumentException("geen observer meegegeven");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Rekening rekening) {
        for(Observer o : observers){
            o.update(lijst);

        }
    }
}


