package assignments.lesson4.problem1;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }


}
