//inner class code 
// we cannot make outer class static 
class A{ 
    int age;
    public void show(){
        System.out.println("in show");

    }
// we can also make inner class static just by adding static keyword before class and then we can create object of inner class without creating object of outer class
    class B{
        public void config(){
            System.out.println("in config ");
        }

    }
}
public class demo20 {
    public static void main(String args[])
{
A obj=new A();
obj.show();
A.B obj1=obj.new B();// and for static we have to write this way A.B obj1=new A.B();
obj1.config();
}    
}
