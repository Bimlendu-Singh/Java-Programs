package mypack1;
import java.util.*;             //Importing all class from util package

public class Calculator				//Calculator class
{
  Scanner in = new Scanner(System.in);
  int a,b;
  
  //Input method
  public void input()
  {
    System.out.println("Enter Two Number : ");
    a = in.nextInt();
    b = in.nextInt();
  }
  
  public void add()
  {
    System.out.println("Sum of given Number is : " +(a+b));
  }
  
  
  public void sub()
  {
    System.out.println("Difference of given Number is : " +(a-b));
  }
  
   public void multi()
  {
    System.out.println("Product of given Number is : " +(a*b));
  }

   public void div()
  {
    System.out.println("Division of given Number is : " +(a/b));
  }
}
