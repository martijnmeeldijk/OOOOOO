package launcher;

import domain.*;

public class Test {
    public static void main(String args[]){
        ConcreteStrategySpiegel concreteStrategySpiegel = new ConcreteStrategySpiegel();
        String string = concreteStrategySpiegel.codeer("draai om");
        System.out.println(string);
        System.out.println(concreteStrategySpiegel.decodeer(string));
    }
}

