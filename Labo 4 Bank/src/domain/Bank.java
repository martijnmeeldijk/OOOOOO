package domain;

import java.util.Map;


public class Bank {
    private Map<String, Rekening> lijst;

    public Bank(Map<String, Rekening> lijst) {
        this.lijst = lijst;
    }

    public void openRekening(Rekening rekening){
        if(rekening == null) throw new IllegalArgumentException("penis");
        lijst.put(rekening.getNummer(), rekening);
    }

        public Rekening getRekening(String nummer){
            return lijst.get(nummer);
        }
    }


