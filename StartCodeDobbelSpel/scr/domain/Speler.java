package domain;

import view.ScoreView;

import java.util.*;

public class Speler implements Subject {
    private int spelersnr;
    private int worp1;
    private int worp2;
    private int punten;
    private int vorigeAantalOgen;
    private Map<Integer,Observer> observers;

    public Speler(int spelersnr) {
        observers= new HashMap<>();
        this.spelersnr=spelersnr;
        this.worp1 = 0;
        this.worp2 = 0;
        this.punten=0;
    }

    public void gooi(){
        this.worp1= (int) Math.ceil(Math.random()*6);
        this.worp2= (int) Math.ceil(Math.random()*6);
    }

    public int berekenScore(){
        int score;
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

    public int getWorp2() {
        return worp2;
    }

    public int getPunten() {
        return punten;
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
            //System.out.println("de observerkey:"+getallen+",spelersnr:"+spelersnr);
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
