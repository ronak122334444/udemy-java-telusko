class A {

    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        this(10); // same class constructor call
        System.out.println("in B");
    }

    public B(int n) {
        super(n); // parent class constructor call
        System.out.println("in B int");
    }
}

public class demo17 {

    public static void main(String[] args) {

        B obj = new B();
    }
}