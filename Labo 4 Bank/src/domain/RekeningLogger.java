package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RekeningLogger implements Observer{

    public RekeningLogger() {
    }


    @Override
    public void update(LinkedHashMap<String, Rekening> rekeningen) {
        List<Rekening> test= (List<Rekening>) rekeningen.values();
        //Object[] rekeningen1 = rekeningen.entrySet().toArray();
        //Rekening rekening1 =(Rekening) rekeningen1[rekeningen1.length -1];
        Rekening rekening1 = test.get(test.size() - 1);
        System.out.println("Nummer " + rekening1.getNummer() + "\nsaldo= " + rekening1.getSaldo() +"\n"+ LocalDateTime.now().toString());
        System.out.println("Het aantal rekeningen = " + test.size());
    }
}
