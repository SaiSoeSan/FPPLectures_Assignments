package assignments.lesson4.problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {
                new Clothing("Product1",300.20,"Uniqlo",10),
                new Electronics("Product2",335.20,5,201),
                new Furniture("Product3",100.20,"Wood",89),
                new Clothing("Product4",300.20,"H&M",3),
                new Clothing("Product5",20.20,"LV",1),
        };

        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("Sum of product " + sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        for (Product p : col) {
            if(p != null){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
