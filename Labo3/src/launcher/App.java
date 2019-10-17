package launcher;

//Imports are listed in full to show what's being used
//could just import javafx.*
import domain.*;
import ui.Javafx;

public class App {
    public static void main(String args[]){
        Shop shop = new Shop();

        shop.voegMateriaalToe(new Materiaal("a",1));
        shop.voegMateriaalToe(new Materiaal("b",2));
        shop.voegMateriaalToe(new Materiaal("c",3));

        boolean stop = false;
        while(!stop){
            String main = Javafx.drawMainMenu();
            String id;
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
                    id = Javafx.giveId();
                    if(id!=null) shop.verwijderMateriaal(Integer.parseInt(id));
                    break;
                case "3":
                    id = Javafx.giveId();
                    if(id!=null) shop.getmateriaal(Integer.parseInt(id)).getCurrentState().leenUit();
                    break;
                case "4":
                    id = Javafx.giveId();
                    if(id!=null) {
                        String damage = Javafx.checkDamage();
                        if(damage!=null){
                            if(damage.equals("1")) shop.getmateriaal(Integer.parseInt(id)).getCurrentState().brengTerug(true);
                            else if(damage.equals("2")) shop.getmateriaal(Integer.parseInt(id)).getCurrentState().brengTerug(false);
                            else throw new IllegalArgumentException();
                        }
                    }
                    break;
                case "5":
                    id = Javafx.giveId();
                    if(id!=null) shop.getmateriaal(Integer.parseInt(id)).getCurrentState().herstel();
                    break;
            }
        }
    }
}
