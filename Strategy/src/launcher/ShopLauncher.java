package launcher;

import domain.CodeerContext;
import ui.CodeerUi;
import javax.swing.*;

public class ShopLauncher {
    public static void main(String[] args) {
        String choiceString = CodeerUi.drawMainMenu();
        if(choiceString.equals("1")){
            String methode = CodeerUi.codingOrEncoding();
        }
        else if(choiceString.equals("2")){
            String methode = CodeerUi.codingOrEncoding();
        }



        //CodeerUi codeerUi = new CodeerUi();

    }
}
