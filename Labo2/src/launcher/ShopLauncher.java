package launcher;

import domain.*;
import ui.CodeerUi;

public class ShopLauncher {
    public static CodeerContext codeerContext = new CodeerContext("codingcontext", null);
    public static void main(String[] args) {
        boolean stop = false;
        while(!stop){
            String methode = CodeerUi.drawMainMenu();
            codeerContext.setCodingStrategy(CodeerFactory.createCoding(methode));

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
