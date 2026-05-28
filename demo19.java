 abstract class Car{
    public  abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("playing music");    
    }
}
  abstract class Wagon extends Car{
   
    public void drive(){
        System.out.println("driving wagon");
    }
}
  class SuperCar extends Wagon{
    public void fly(){
        System.out.println("flying supercar");
    }
  }


public class demo19 {
    public static void main(String args[]){
Car c=new SuperCar();
c.drive();
c.playMusic();
c.fly();
    }
    
    
}
