
//Switch and esle if are used to execute a block of code among multiple options.in enum 
enum Status {
    Running, Pending, Failed, Success;
}

public class demo25 {
    public static void main(String args[]) {
        Status s = Status.Running;
        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Success:
                System.out.println("Success");
                break;
        }
    }
}

