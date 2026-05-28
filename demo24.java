
enum Status{
    Running,Completed,Pending;
}
public class demo24 {
    public static void main(String args[]){
        int i=5;
        Status s=Status.Running;
        System.out.println(s.ordinal());// ordinal method is used to get the index of the enum constant
        System.out.println(s.name());// name method is used to get the name of the enum constant

    }

    
}
