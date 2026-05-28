@FunctionalInterface// it is a functional interface because it contains only one abstract method
interface A{
    void show(int i);
}
public class demo27 {
    public static void main(String args[]){
        A obj=(int i)->{System.out.println("in show of functional interface"+i);// this is called lambda expression because we are using lambda expression to implement the abstract method of functional interface
            

         };obj.show(5); }
    
}
