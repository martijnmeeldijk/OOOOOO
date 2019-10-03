package domain;

public abstract class Product {

    private String productTitle;
    private String productId;

    public Product(String productTitle, String productId){
        this.productId=productId;
        this.productTitle=productTitle;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public abstract double getPrice(int days);

}
