class A{
    public void show(){
        System.out.println("in show");
    }
}


public class demo21 {
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("in show of anonymous class      ");
            }
        };
        obj.show();
    }
    
}
