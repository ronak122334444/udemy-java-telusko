class Mobile {

    String brand;
    int price;
    static String name;

    // Static block
    static {
        name = "phone";
        System.out.println("Static block called");
    }

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;

        System.out.println("Constructor called");
    }

    // Method
    public void show() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Name  : " + name);
    }
}

public class demo11 {

    public static void main(String args[]) {

        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 20000;

        Mobile.name = "Galaxy S21";

        m1.show();

        System.out.println();

        Mobile m2 = new Mobile();

        m2.brand = "Apple";
        m2.price = 80000;

        m2.show();
    }
}