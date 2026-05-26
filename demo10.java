//static means you are making something as a class member 
class Mobile{

    String brand;
    int price;
   static String name;
    public void show(){
        System.out.println("brand: "+brand);
        System.out.println("price: "+price);
        System.out.println("name: "+name);
    }
}
public class demo10 {
    public static void main (String args[]){
        Mobile m1=new Mobile();
        m1.brand="samsung";
        m1.price=20000;
        m1.name="Galaxy S21";
        m1.show();
        Mobile m2=new Mobile();
        m2.brand="apple";   
        m2.price=100000;
       
      
        m2.show();
         

    
}}
