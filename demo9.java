//parametrized constructor 
class ronak {
    int age;String name;
    public ronak(int age,String name){
        this.age=age;
        this.name=name;
    }
}
public class demo9 {
    public static void main (String args[]){
        ronak r1=new ronak(25,"ronak");
        System.out.println(r1.age);
        System.out.println(r1.name);
    }
    
}
