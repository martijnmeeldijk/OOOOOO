package domain;

public class Movie extends Product{

    public Movie(String productTitle, String productId) {
        super(productTitle, productId);
    }

    @Override
    public double getPrice(int days) {
        int price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
