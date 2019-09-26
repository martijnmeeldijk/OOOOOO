package launcher;

import domain.*;

public class ShopLauncher {
    public static void main(String[] args) {
        ConcreteStrategySpiegel spiegel = new ConcreteStrategySpiegel();
        System.out.println(spiegel.spiegel("draai om"));
    }
}
