package domain;

public class ConcreteStrategyCaesar implements CodingStrategy {
    String message;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public ConcreteStrategyCaesar(String message){
        this.message = message;
    }

    @Override
    public String decodeer(String message) {
        return null;
    }

    @Override
    public String codeer(String message) {
        return null;
    }
}
