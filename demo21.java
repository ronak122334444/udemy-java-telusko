// Anonymous class is a class without name and we are creating object of that class at the same time
class A{
    public void show(){
        System.out.println("in show");
    }
}


public class demo21 {
    public static void main(String args[]){
        A obj = new A(){// this is called anonymous class because we are creating a class without name and we are creating object of that class at the same time
            public void show(){
                System.out.println("in show of anonymous class      ");
            }
        };
        obj.show();
    }
    
}
