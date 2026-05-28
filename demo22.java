// can use abstract class with the help of annonymous inner class 
 abstract class A{
    public  abstract void show();
}



public class demo22 {
    public static void main(String args[]){
A obj=new A(){
    public void show(){
        System.out.println("in show       ");
    }
};
obj.show();
    }
    
}
