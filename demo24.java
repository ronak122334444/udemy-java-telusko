//enum is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week. Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc.
enum Status{
    Running,Completed,Pending;
}
public class demo24 {
    public static void main(String args[]){
        int i=5;
        Status ss[]=Status.values();// values method is used to get all the constants of the enum in the form of array
        for(Status s:ss){
            System.out.println(s);
        }
       // System.out.println(s.ordinal());// ordinal method is used to get the index of the enum constant
       // System.out.println(s.name());// name method is used to get the name of the enum constant


    }

    
}
