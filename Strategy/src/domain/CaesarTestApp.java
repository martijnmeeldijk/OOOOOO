package domain;

public class CaesarTestApp {
    public static void main(String[] args){
        ConcreteStrategyCaesar caesar = new ConcreteStrategyCaesar(5);
        System.out.println(caesar.codeer("poep"));
    }
}
