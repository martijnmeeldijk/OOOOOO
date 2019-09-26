package ui;

import domain.CodeerContext;

import javax.swing.*;

public class CodeerUi {
    private CodeerContext codeerContext;

    public CodeerUi(CodeerContext codeerContext) {
        this.codeerContext = codeerContext;
    }

    public static void drawMainMenu(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price \n\n0. Quit";
        String choiceString = JOptionPane.showInputDialog(menu);
    }
}
