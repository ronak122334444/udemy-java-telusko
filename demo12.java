//asonymous object is an object which does not have any reference variable to refer it. we can create an anonymous object by using new keyword and constructor of the class without assigning it to any reference variable.
class ronak{
    public void show(){
        System.out.println("hello");
    }
   
}
public class demo12 {
    public static void main(String args[]){

   new ronak();
new ronak().show();}
    
}
