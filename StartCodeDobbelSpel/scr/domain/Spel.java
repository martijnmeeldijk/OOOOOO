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
    Map<Integer, Speler> spelers;
    ScoreView scoreView;

    public Spel() {
        spelers= new HashMap<Integer,Speler>();
        scoreView= new ScoreView();
    }

    public Speler getSpeler(int spelersnr){
        return spelers.get(spelersnr);
    }

    public void add(int key,Speler speler) {
        spelers.put(key,speler);
    }

    @Override
    public void update(int spelersNummer) {
        //System.out.println("help"); neen
        //scoreView.update(spelersNummer); doet letterlijk niets
        scoreView.voegScoreLijnToe("speler "+ spelersNummer+ " heeft score "+ (spelers.get(spelersNummer).getPunten()));
        //scoreView.updateLabel();

        //volgende speler of volgende beurt
        if(speler==spelers.size()-1 && beurt<4){
            speler=0;
            beurt++;
            //spelers.get(speler).
            //scoreView.update(beurt);
        }
        else {
            System.out.println(speler);
            speler++;
        }

    }

    public int getBeurt() {
        return beurt;
    }
}
