package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Spel implements Subject {
    ArrayList<Speler> spelers;
    Map<Integer,Observer> observers;

    public Spel() {
        spelers=new ArrayList<>();
        observers= new HashMap<Integer, Observer>();
    }

    @Override
    public void add(int key, Observer observer) {

    }

    @Override
    public void remove(int key, Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
