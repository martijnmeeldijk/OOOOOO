package ui;

import javax.swing.*;
import domain.*;

public class Ui {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int choice = -1;
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";

        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct(shop);
            } else if (choice == 2) {
                showProduct(shop);
            } else if (choice == 3){
                showPrice(shop);
            }
        }
    }

    public static void addProduct(Shop shop) {
        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");

        while(!(type.equals("M")||type.equals("G"))) {
            type = JOptionPane.showInputDialog("Only M and G are valid, try again:");
        }

        if (type.equals("M")) {
            Movie movie = new Movie(title, id);
            shop.addProduct(movie);
        } else {
            Game game = new Game(title, id);
            shop.addProduct(game);
        }

    }

    public static void showProduct(Shop shop){
        String id = JOptionPane.showInputDialog("Enter the id:");
        try {
            Product product = shop.getProduct(id);
            JOptionPane.showMessageDialog(null, product.getProductTitle());
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void showPrice(Shop shop) {
        String id = JOptionPane.showInputDialog("Enter the id:");
        try {
            Product product = shop.getProduct(id);

            int days = -1;
            String message = "Enter the number of days:";
            while (days <= 0){
                String daysString = JOptionPane.showInputDialog(message);
                days = Integer.parseInt(daysString);
                message = "Enter a valid number of days:";
            }
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getPrice(days));

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }
}
