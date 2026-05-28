
// interface is a collection of abstract methods and constants
interface A {

    int age=44;// by default all the variables in interface are public static final so we can omit public static final keyword
    String area="Mumbai";


    void  show();// by default all the methods in interface are abstract and public so we can omit abstract and public keyword
    void config();
} 
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class demo23 {
  
    public static void main(String args[]){
        A obj=new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.area);

    
}}
