import java.util.Scanner;

class StringNextInput
{
  public static void main(String args[])
  {
    String x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter String : ");
    x = in.next();
    System.out.println("Your input in String next is : " +x);
  }
}
