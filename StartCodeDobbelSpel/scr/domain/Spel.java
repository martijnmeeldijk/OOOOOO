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
    Map<Integer, PlayerView> spelers;
    ScoreView scoreView;

    public Spel() {
        spelers= new HashMap<Integer,PlayerView>();
        scoreView= new ScoreView();
    }

    public void add(int key,PlayerView playerView) {
        spelers.put(key,playerView);
    }

    @Override
    public void update(int spelersNummer) {
        scoreView.update(spelersNummer);

        scoreView.updateLabel(scoreView.getlabel() +"\n" + "speler "+ spelersNummer+ " heeft score "+ (spelers.get(spelersNummer).getSpeler().getPunten()));
        if(speler==spelers.size()-1 && beurt<4){
            speler=0;
            spelers.get(1).isAanBeurt(true);
            beurt++;
        }
        else {
            speler++;
        }

    }
}
