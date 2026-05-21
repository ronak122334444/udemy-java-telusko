class demo{
    public int add (int a,int b){
        int r=a+b;
        return r;

    }
}
public class Calculator {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        demo dem=new demo();
        int result=dem.add(num1,num2);

        System.out.println("The sum is: "+result);
    }
    
}
