package assignments.lesson4.problem1;

public class Clothing extends Product {
    private String brand;
    private double discount;

    public Clothing(String productName, double price,String brand, double discount) {
        super(productName, price);
        this.brand = brand;
        this.discount = discount;
    }
    @Override
    public double getPrice(){
        double basePrice = super.getPrice();
        return basePrice + basePrice * (this.discount / 100);
    }

    public String toString(){
        return String.format("Product Name : " + this.getProductName() + "\n"+
                "Price : "+ this.getPrice() + "\n" +
                "Brand : " + this.brand + "\n" +
                "Discount : " + this.discount + "\n"
                );
    }



}
