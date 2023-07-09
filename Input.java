import java.util.Scanner;

public class Input
{
  public static void main(String args[])
  {
    Scanner i = new Scanner(System.in);
    
    System.out.println("Enter the first number ");
    int a = i.nextInt();
        
    System.out.println("Enter the 2nd number ");
    int b = i.nextInt();
    
    System.out.println("Multiplication of a and b is : " +(a*b));
    
    int sum;   
    sum = a+b;
    System.out.println("Sum of a and b is : " +sum);
    

  }

}