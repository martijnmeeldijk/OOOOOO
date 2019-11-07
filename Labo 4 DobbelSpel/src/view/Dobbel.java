package view;

import java.util.Random;

public class Dobbel {
    public int previous=0;
    public int points=0;

    public int stone(){
        return 1 + (int)(Math.random() * 6);
    }

    public String dobbel(){
        int a = stone();
        int b = stone();
        if(a==b) points+=(a+b)*2;
        else points+=a+b;
        if(a+b==previous) points+=5;
        previous = a+b;
        return a+" en "+b+" - score:"+points;
    }
}
