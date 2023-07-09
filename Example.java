package mypack2;
import mypack1.Student2;

public class Example
{
    public static void main(String args[])
    {   
     Student2 child = new Student2();
     child.setName("BheemSingh");
     child.setRollNo(6);
     System.out.println("Student name is : " +child.getName());
     System.out.println("Student RollNo is : " +child.getRollNo());
     
    }
}