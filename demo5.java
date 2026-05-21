class student{
    String name;
    int rollno;
    int marks;
}
public class demo5 {
    public static void main(String args[]){
        student s1=new student();
        s1.name="sachin";
        s1.rollno=10;
        s1.marks=85;
        student s2=new student();
        s2.name="ronak";
        s2.rollno=11;
        s2.marks=90;    
        student s3=new student();
        s3.name="satyam";   
        s3.rollno=12;
        s3.marks=95;
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println("name: "+students[i].name);
            System.out.println("rollno: "+students[i].rollno);
            System.out.println("marks: "+students[i].marks);


        }
    }
    
}
