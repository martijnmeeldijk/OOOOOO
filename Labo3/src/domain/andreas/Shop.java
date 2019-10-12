package domain.andreas;

import java.io.*;
import java.util.*;


public class Shop implements Serializable {
    private Map<Integer, FeestArtikel> articles;

    public Shop() {
        deserialize();
        if (articles == null) {
            articles = new HashMap<>();
            System.out.println("Had to make new Map");
        }
    }

    private int getNewID() {
        int id = 0;
        while (articles.get(++id) != null) {}
        return id;
    }

    public void addProduct(int id, FeestArtikel article) {
        if (id <= 0) {
            id = getNewID();
        }
        articles.put(id, article);
    }

    public void deleteProduct(int id) {
        articles.remove(id);
    }

    public double rentItem(int id) {
        return articles.get(id).leenUit();
    }

    public double returnItem(int id, boolean beschadigd) {
        return articles.get(id).brengTerug(beschadigd);
    }

    public void repair(int id) {
        articles.get(id).herstel();
    }

    public Map<Integer, FeestArtikel> getAvailableProducts() {
        Map<Integer, FeestArtikel> artikels = new HashMap<>();
        for (int id : articles.keySet()) {
            if (articles.get(id).getCurrentState() instanceof UitleenbaarState) {
                artikels.put(id, articles.get(id));
            }
        }
        return artikels;
    }

    public FeestArtikel getProduct(int id) {
        return articles.get(id);
    }

    public Map<Integer, FeestArtikel> getArticles() {
        return articles;
    }

    public Map<Integer, FeestArtikel> getNietVerwijderd() {
        Map<Integer, FeestArtikel> artikels = new HashMap<>();
        for (int id : articles.keySet()) {
            if (!(articles.get(id).getCurrentState() instanceof VerwijderdState)) {
                artikels.put(id, articles.get(id));
            }
        }
        return artikels;
    }





    public void serialize() {
        String filename = "shop.txt";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(getNietVerwijderd());
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    private void deserialize() {
        try {
            FileInputStream file = new FileInputStream("shop.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            articles = (HashMap<Integer, FeestArtikel>) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        } catch (IOException ex) {
            System.out.println("IOException is caught: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}