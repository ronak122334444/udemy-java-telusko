//Method overriding in class b show method id overiding show metjod of a class 

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config (){
        System.out.println("in A config");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
   
}

public class demo18 {
    public static void main(String[] args) {
        B b1=new B();
        b1.show();
        b1.config();
    }
}
