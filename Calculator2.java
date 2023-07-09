//Calculator Program
import java.util.Scanner;

public class Calculator2
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter two Number : ");
      int a = in.nextInt();
      int b = in.nextInt();
      
      System.out.println(" Sum is : " +(a+b) +"\n Difference is : " +(a-b) +"\n Multiplication is : " +(a*b) +"\n Division is : " +(a/b));
    }
}