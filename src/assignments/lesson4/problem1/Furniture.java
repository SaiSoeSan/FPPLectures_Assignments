package assignments.lesson4.problem1;

public class Furniture extends Product {

    private String material;
    private double shippingCost;
    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + this.shippingCost;
    }

    public String toString(){
        return String.format("Product Name : " + this.getProductName() + "\n"+
                "Price : "+ this.getPrice() + "\n");
    }
}
