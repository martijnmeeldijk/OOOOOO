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


        return null;
    }

    private char permuteerChar(int aantalPlaatsen){
        return 'a';
    }
}
