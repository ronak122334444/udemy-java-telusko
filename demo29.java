class A extends Thread {
   
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
   
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}   

public class demo29 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
    
}
