package domain;

public class ConcreteStrategySpiegel {

    public String spiegel(String teSpiegelen){
        char[] array = teSpiegelen.toCharArray();
        StringBuilder spiegel= new StringBuilder();
        for(int i=array.length-1;i>=0;i--){
            spiegel.append(String.valueOf(array[i]));
        }
        return spiegel.toString();
    }
}
