
enum Laptop {
    DELL(2000), HP(1800), LENOVO, APPLE(2300), ACER;

    //as we are creating the objects in the same class, we are creating private variables and methods/constructors

    private int price;
    private Laptop() {
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class DemoAdvENUM {

    public static void main(String[] args) {
        
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

        Laptop lap = Laptop.ACER;

        lap.setPrice(5000);
        System.out.println(lap + " : " + lap.getPrice());





    }
}
