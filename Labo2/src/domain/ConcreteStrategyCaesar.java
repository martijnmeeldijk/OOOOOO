package domain;

import java.util.ArrayList;

public class ConcreteStrategyCaesar implements CodingStrategy {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int aantalPlaatsen;

    public ConcreteStrategyCaesar(int aantalPlaatsen){
        this.aantalPlaatsen = aantalPlaatsen;
    }

    public ConcreteStrategyCaesar() {
        aantalPlaatsen = 13;
    }

    public char[] getAlphabet() {
        return alphabet;
    }

    public void setAantalPlaatsen(int aantalPlaatsen) {
        this.aantalPlaatsen = aantalPlaatsen;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    @Override
    public String decodeer(String message) {
        char[] messageArray = message.toLowerCase().toCharArray();
        int aantal = -aantalPlaatsen;

        for(int i = 0; i<messageArray.length ; i++){
            messageArray[i] = permuteerChar(aantal, messageArray[i]);
        }

        return joinArray(messageArray);
    }

    @Override
    public String codeer(String message) {
        char[] messageArray = message.toLowerCase().toCharArray();
        int aantal = aantalPlaatsen;

        for(int i = 0; i<messageArray.length ; i++){
            messageArray[i] = permuteerChar(aantal, messageArray[i]);
        }

        return joinArray(messageArray);
    }
    private String joinArray(char[] array){
        String message = "";
        for (char s : array){
            message += s;
        }
        return message;
    }

    // Verschuift een letter een aantal plaatsen
    private char permuteerChar(int aantalPlaatsen, char letter){
        if(aantalPlaatsen < 0){
            aantalPlaatsen = 26 + aantalPlaatsen;
        }

        for (int i = 0; i < aantalPlaatsen; i++){
            if(letter == 'z') letter = 'a';
            else letter ++;
        }

        return letter;
    }

}
