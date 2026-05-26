//Encapsulation
class abc{
     private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public  void setAge(int a){
        age=a;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }   


} 
public class demo6 {
  


public static void main(String args[]){
    abc a1=new abc();
    a1.setAge(18);
    a1.setName("ronak");
System.out.println(a1.getAge());
System.out.println(a1.getName());
    
}}
