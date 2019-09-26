package domain;

public class ConcreteStrategySpiegel {

    public String spiegel(String teSpiegelen){
        char[] array = teSpiegelen.toCharArray();
        String spiegel="";
        for(int i=array.length-1;i>=0;i--){
            spiegel+=array[i];
        }
        return spiegel;
    }
}
