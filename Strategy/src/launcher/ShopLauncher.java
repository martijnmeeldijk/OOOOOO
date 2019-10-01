package launcher;

import domain.CodingStrategy;
import domain.ConcreteStrategyCaesar;
import domain.ConcreteStrategySpiegel;
import ui.CodeerUi;

public class ShopLauncher {
    public static CodingStrategy codingStrategy;
    public static void main(String[] args) {
        String methode = CodeerUi.drawMainMenu();
        String deorenc = CodeerUi.codingOrEncoding();
        String text = CodeerUi.showString();
        if(methode.equals("1")){//kies concrete strat
            codingStrategy = new ConcreteStrategyCaesar(2);
        }
        else if(methode.equals("2")){
            codingStrategy = new ConcreteStrategySpiegel();
        }
        else {
            throw new IllegalArgumentException();
        }
        if(deorenc.equals("1")){//choose coding or decoding
            CodeerUi.showString(codingStrategy.codeer(text));
            System.out.println(codingStrategy.codeer(text));
        }
        else if(deorenc.equals("2")){//choose coding or decoding
            CodeerUi.showString(codingStrategy.decodeer(text));
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
