class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println("brand: "+brand);
        System.out.println("price: "+price);
        System.out.println("name: "+name);
    }
    public static void show1(Mobile m){
          System.out.println("brand: "+m.brand);
        System.out.println("price: "+m.price);
        System.out.println("name: "+m.name);
    }

}
public class demo11 {
    public static void main(String args[]){
        Mobile m1=new Mobile();
        m1.brand="samsung";
        m1.price=20000;
        Mobile.name="Galaxy S21";
        m1.show();
        Mobile.show1(m1);
    }
    
}
