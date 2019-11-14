package domain;

public class ConcreteStrategySpiegel implements CodingStrategy{

    public ConcreteStrategySpiegel() {
    }

    @Override
    public String decodeer(String message) {
        return codeer(message);
    }

    @Override
    public String codeer(String message) {
        char[] array = message.toCharArray();
        StringBuilder spiegel= new StringBuilder();
        for(int i=array.length-1;i>=0;i--){
            spiegel.append(array[i]);
        }
        return spiegel.toString();
    }
}
