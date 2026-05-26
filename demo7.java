// this keyword is used to refer to the current class instance variable
class human{
     private int age;
     private String name;
     public int getAge(){
         return age;
     }
        public  void setAge(int age){
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
}
public class demo7{
    public static void main(String args[]){
        human h1=new human();
        h1.setAge(18);
        h1.setName("sachin");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());

    }
}