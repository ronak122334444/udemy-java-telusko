//enum class is a special class which represents a group of constants (unchangeable variables, like final variables). It is used to define a collection of constants that can be represented as a type. Enums are useful when you have a fixed set of related constants that you want to group together and use in your code.

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