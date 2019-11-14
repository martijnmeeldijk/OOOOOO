package domain;

import view.PlayerView;
import view.ScoreView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Spel implements Observer {
    private int beurt=1;
    private int speler;
    private Map<Integer, Speler> spelers;
    private ScoreView scoreView;

    public Spel() {
        spelers= new HashMap<>();
        scoreView= new ScoreView();
    }

    public int aantalSpelers(){
        return spelers.size();
    }

    public Speler getSpeler(int spelersnr){
        if(spelersnr>spelers.size()) {
            return spelers.get(1);
        }
        return spelers.get(spelersnr);
    }

    public void add(int key,Speler speler) {
        spelers.put(key,speler);
    }

    @Override
    public void update(int spelersNummer) {
        scoreView.voegScoreLijnToe("speler "+ spelersNummer+ " heeft score "+ (spelers.get(spelersNummer).getPunten()));

        //volgende speler of volgende beurt
        if(speler==spelers.size()-1 && beurt<4){
            speler=0;
            beurt++;
            if(beurt<4) scoreView.update(beurt);
        }
        else {
            speler++;
        }

    }

    public int getBeurt() {
        return beurt;
    }
}
