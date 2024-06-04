package assignments.lesson4.problem1;

public class Electronics extends Product {
    private int warranty;
    private double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + this.warrantyCost;
    }

    public String toString(){
        return String.format("Product Name : " + this.getProductName() + "\n"+
                "Price : "+ this.getPrice() + "\n");
    }
}
