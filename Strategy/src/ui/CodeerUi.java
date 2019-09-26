package ui;

import domain.CodeerContext;

import javax.swing.*;

public class CodeerUi {
    private CodeerContext codeerContext;

    public CodeerUi(CodeerContext codeerContext) {
        this.codeerContext = codeerContext;
    }

    public static String drawMainMenu(){
        String menu = "1. caesar\n2. spiegelen\\n\n0. Quit";
        String codemethod = "1. codeer \n 2. decodeer";
        String choiceString = JOptionPane.showInputDialog(menu);
        return choiceString;
    }
}
