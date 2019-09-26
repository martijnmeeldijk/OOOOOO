package launcher;

import domain.CodeerContext;
import ui.CodeerUi;

import javax.swing.*;

public class ShopLauncher {
private static CodeerUi codeerUi;
    public static void main(String[] args) {

        //String menu = "1. caesar\n2. spiegelen\\n\n0. Quit";
        String codemethod = "1. codeer \n 2. decodeer";

        String choiceString = codeerUi.drawMainMenu();
        if(choiceString.equals("1")){
            String methode = JOptionPane.showInputDialog(codemethod);
        }



        //CodeerUi codeerUi = new CodeerUi();

    }
}
