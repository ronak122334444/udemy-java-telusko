// exception handling in java
public class demo28 {
    public static void main(String args[]){
        double i=4;
        double j=0;
        try{
            j=18/i;
        }
        catch(Exception ex){
            System.out.println("went wrong");
                
        }
      System.out.println(j);
      System.out.println("bye");
    }
    
}
