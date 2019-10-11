package launcher;

import domain.CodeerContext;
import domain.ConcreteStrategyCaesar;
import domain.ConcreteStrategySpiegel;
import ui.CodeerUi;

public class ShopLauncher {
    public static CodeerContext codeerContext = new CodeerContext("codingcontext", null);
    public static void main(String[] args) {
        String methode = CodeerUi.drawMainMenu();
        String deorenc = CodeerUi.codingOrEncoding();
        String text = CodeerUi.showString();
        if(methode.equals("1")){//kies concrete strat
            codeerContext.setCodingStrategy(new ConcreteStrategyCaesar(2));
        }
        else if(methode.equals("2")){
            codeerContext.setCodingStrategy(new ConcreteStrategySpiegel());
        }
        else {
            throw new IllegalArgumentException();
        }
        if(deorenc.equals("1")){//choose coding or decoding
            codeerContext.setText(text);
            codeerContext.codeer();
            CodeerUi.showString(codeerContext.getResult());
        }
        else if(deorenc.equals("2")){//choose coding or decoding
            codeerContext.setText(text);
            codeerContext.decodeer();
            CodeerUi.showString(codeerContext.getResult());
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
