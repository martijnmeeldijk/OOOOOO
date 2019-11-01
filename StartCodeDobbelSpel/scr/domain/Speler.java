package domain;

import java.util.*;

public class Speler implements Subject {
    private int spelersnr;
    int worp1;
    int worp2;
    int punten;
    int vorigeAantalOgen;
    Map<Integer,Observer> observers;
    //List<Observer> observers;

    public Speler(int spelersnr) {
        observers= new HashMap<Integer,Observer>();
        this.spelersnr=spelersnr;
        this.worp1 = 0;
        this.worp2 = 0;
        this.punten=0;
        //observers=new ArrayList<>();
    }

    public void gooi(){
        this.worp1= (int) Math.ceil(Math.random()*6);
        this.worp2= (int) Math.ceil(Math.random()*6);
    }

    public int berekenScore(){
        int score=0;
        if(worp1==worp2){
            score=(worp1+worp2)*2;
        }
        else {
            score=worp1+worp2;
        }
        if(vorigeAantalOgen==worp1+worp2){
            score+=5;
        }
        vorigeAantalOgen=worp1+worp2;
        punten=score;
        return score;
    }

    public int getWorp1() {
        return worp1;
    }

    public void setWorp1(int worp1) {
        this.worp1 = worp1;
    }

    public int getWorp2() {
        return worp2;
    }

    public int getPunten() {
        return punten;
    }

    public void setWorp2(int worp2) {
        this.worp2 = worp2;
    }

    @Override
    public void add(int key,Observer observer) {
        observers.put(key,observer);
    }

    @Override
    public void remove(int key,Observer observer) {
        observers.remove(key,observer);
    }

    @Override
    public void notifyObserver() {
        Set<Integer> keys=observers.keySet();
        for (Integer getallen:keys) {
            observers.get(getallen).update(spelersnr);
        }
    }

    public int getSpelersnr() {
        return spelersnr;
    }

    public Map<Integer, Observer> getObservers() {
        return observers;
    }

}
