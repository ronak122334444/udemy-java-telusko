class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class demo30 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }
}
