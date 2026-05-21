class calculator{
    public int add(int a,int b){
        return a+b
;    }
public int add(int a,int b,int c){
    return a+b+c;

}
}
public class overloading {
    public static void main(String[] args) {
        calculator calc=new calculator();
       int result= calc.add(4,5,6);
        System.out.println(result);
        
    }
    
}
