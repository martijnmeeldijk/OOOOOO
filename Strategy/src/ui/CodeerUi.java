package ui;

import domain.CodeerContext;

import javax.swing.*;

public class CodeerUi {

    public static String drawMainMenu(){
        String menu = "1. caesar\n2. spiegelen\\n\n0. Quit";
        String choiceString = JOptionPane.showInputDialog(menu);
        return choiceString;
    }
    public static  String codingOrEncoding(){
        String codemethod = "1. codeer \n 2. decodeer";
        String choiceString = JOptionPane.showInputDialog(codemethod);
        return choiceString;
    }
    public static  String showString(){
        String codemethod = "geef te coderen string";
        String choiceString = JOptionPane.showInputDialog(codemethod);
        return choiceString;
    }

    public static  void showString(String string){
        JOptionPane.showMessageDialog(null, string);
    }



}
