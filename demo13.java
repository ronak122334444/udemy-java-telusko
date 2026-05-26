
 // multilevel inheritance

 class demo14 {
     public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    
}
class demo15 extends demo14 {
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
    
}
class demo16 extends demo15{
    public double power (int n1,int n2){
        return Math.pow(n1, n2);
    }
}
public class demo13 {
    public static void main(String args[]){
        demo16 d1=new demo16();
        int sum=d1.add(10, 20);
        int diff=d1.sub(20, 10);
        int multi=d1.multi(10, 20);
        int div=d1.div(20, 10);
        double power=d1.power(10, 20);
        System.out.println("sum: "+sum);
        System.out.println("difference: "+diff);
        System.out.println("product: "+multi);
        System.out.println("quotient: "+div);
        System.out.println("power: "+power);
    }
    
}
