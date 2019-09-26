package domain;

import java.util.ArrayList;

public class ConcreteStrategyCaesar implements CodingStrategy {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int aantalPlaatsen;

    public ConcreteStrategyCaesar(int aantalPlaatsen){
        this.aantalPlaatsen = aantalPlaatsen;
    }


    @Override
    public String decodeer(String message) {


        return null;
    }

    @Override
    public String codeer(String message) {
        char[] messageArray = message.toLowerCase().toCharArray();
        int aantal = aantalPlaatsen;

        for(int i = 0; i<messageArray.length ; i++){
            messageArray[i] = permuteerChar(aantal, messageArray[i]);
        }

        return null; //String.join("", messageArray);
    }


    // Verschuift een letter een aantal plaatsen
    private char permuteerChar(int aantalPlaatsen, char letter){
        if(aantalPlaatsen < 0){
            aantalPlaatsen = 26 + aantalPlaatsen;
        }

        for (int i = 0; i <= aantalPlaatsen; i++){
            if(letter == 'z') letter = 'a';
            else letter ++;
        }

        return letter;
    }

}
