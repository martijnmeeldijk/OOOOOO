package launcher;

//Imports are listed in full to show what's being used
//could just import javafx.*
import domain.*;
import ui.Javafx;

public class App {
    public static void main(String args[]){
        Shop shop = new Shop();

        boolean stop = false;
        while(!stop){
            String main = Javafx.drawMainMenu();
            if(main == null || main.equals("0")) stop = true;
            else switch(main){
                case "1":
                    String name = Javafx.addPartyItemName();
                    Double price;
                    if(name!=null){
                        price = Double.valueOf(Javafx.addPartyItemPrice());
                        if(price!=null) shop.voegMateriaalToe(new Materiaal(name,price));
                    }
                    break;
                case "6":
                    Javafx.showList(shop.beschikbaar());
                    break;
                case "2":
                    String id = Javafx.giveId();
                    if(id!=null) shop.verwijderMateriaal(Integer.parseInt(id));
            }
        }
    }
}
