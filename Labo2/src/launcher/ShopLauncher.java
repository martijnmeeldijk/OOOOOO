package launcher;

import domain.CodeerContext;
import domain.ConcreteStrategyCaesar;
import domain.ConcreteStrategyRandomAdapter;
import domain.ConcreteStrategySpiegel;
import ui.CodeerUi;

public class ShopLauncher {
    public static CodeerContext codeerContext = new CodeerContext("codingcontext", null);
    public static void main(String[] args) {
        boolean stop = false;
        while(!stop){
            String methode = CodeerUi.drawMainMenu();
            if(methode == null || methode.equals("0")) stop=true;
            else if(methode.equals("1")) codeerContext.setCodingStrategy(new ConcreteStrategyCaesar(2));
            else if(methode.equals("2")) codeerContext.setCodingStrategy(new ConcreteStrategySpiegel());
            else if(methode.equals("3")) codeerContext.setCodingStrategy(new ConcreteStrategyRandomAdapter());
            else throw new IllegalArgumentException();

            if(!stop){
                String deorenc = CodeerUi.codingOrEncoding();
                if(deorenc != null){
                    if(deorenc.equals("1")){//choose coding or decoding
                        String text = CodeerUi.showString();
                        if(text!=null){
                            codeerContext.setText(text);
                            codeerContext.codeer();
                            CodeerUi.showString(codeerContext.getResult());
                        }
                    }
                    else if(deorenc.equals("2")){//choose coding or decoding
                        String text = CodeerUi.showString();
                        if(text!=null){
                            codeerContext.setText(text);
                            codeerContext.decodeer();
                            CodeerUi.showString(codeerContext.getResult());
                        }
                    }
                    else throw new IllegalArgumentException();
                }
            }
        }
    }
}
