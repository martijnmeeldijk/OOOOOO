package domain;

import domain.andreas.FeestArtikel;
import domain.andreas.NotPossibleException;
import domain.andreas.VerwijderdState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Schop {
    private Map<Integer, Materiaal> materiaallijst;

    public Schop() {
        materiaallijst=new HashMap<>();
    }

    public void voegMateriaalToe(Materiaal materiaal){
        int id = nextId();
        materiaallijst.put(id,materiaal);
    }
    public int nextId(){
        int max=0;
        for(int getal: materiaallijst.keySet()){
            if(getal>max){
                max=getal;
            }
        }
        return max+1;
    }



    public void verwijderMateriaal(int id){
        materiaallijst.remove(id);
    }

    public Materiaal getmateriaal(int id){
        return materiaallijst.get(id);

    }

    public void rentItem(int id){
        materiaallijst.get(id).leenUit();
    }
    public void repair(int id){
        materiaallijst.get(id).herstel();
    }

    public Map<Integer, Materiaal> getMateriaallijst() {
        return materiaallijst;
    }

    public Map<Integer, Materiaal> nietVerwijderd() {
        Map<Integer,Materiaal> nietverwijderd= new HashMap<>();
        for(int key: materiaallijst.keySet()){
            if(!(materiaallijst.get(key).getCurrentState() instanceof Verwijderd)){
                nietverwijderd.put(key,materiaallijst.get(key));
            }
        }

        return nietverwijderd;
    }
    public double returnMateriaal(int id, boolean beschadigd) {
        return materiaallijst.get(id).brengTerug(beschadigd);
    }







}
