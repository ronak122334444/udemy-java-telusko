enum Laptop {

    Mackbook(2000), XPS(1500), Surface(1800), Thinkpad(1800);

    private int price;

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

public class demo26 {

    public static void main(String args[]) {

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}