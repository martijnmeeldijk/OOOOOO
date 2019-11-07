package domain;

import view.PlayerView;
import view.ScoreView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Spel implements Observer {
    private int beurt;
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
        System.out.println("help");
        scoreView.update(spelersNummer);
        scoreView.updateLabel(scoreView.getlabel() +"\n" + "speler "+ spelersNummer+ " heeft score "+ (spelers.get(spelersNummer).getPunten()));


        if(speler==spelers.size()-1 && beurt<4){
            speler=0;
            beurt++;
        }
        else {
            speler++;
        }

    }

    public int getBeurt() {
        return beurt;
    }
}
