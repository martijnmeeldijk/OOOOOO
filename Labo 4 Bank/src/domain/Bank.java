package domain;

import java.util.Map;


public class Bank {
    private Map<String, Rekening> lijst;

    public Bank(Map<String, Rekening> lijst) {
        this.lijst = lijst;
    }

    public void openRekening(Rekening rekening){
        if(rekening == null || rekening.getNummer() == null) throw new IllegalArgumentException("geen rekening meegegeven");

        lijst.put(rekening.getNummer(), rekening);
    }

    public Rekening getRekening(String nummer){
        if(lijst.get(nummer) == null) throw new IllegalArgumentException("rekening bestaat niet");
        
        return lijst.get(nummer);
    }

}


