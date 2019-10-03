package domain;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> productlijst = new ArrayList<Product>();

    public void addProduct(Product product){
        productlijst.add(product);
    }

    public Product getProduct(String id) throws IllegalArgumentException{
        for(Product product:productlijst){
            if(product.getProductId().equals(id)) return product;
        }
        throw new IllegalArgumentException("product niet in shop");
    }



}
