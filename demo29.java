class A extends Thread { // Thread class is extended to create a thread
   
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
   
    public void run() {     // run method is overridden to define the task of the thread 
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}   

public class demo29 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();// start method is called to start the thread and execute the run method
        t2.start();
    }
    
}
