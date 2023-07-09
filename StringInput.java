import java.util.Scanner;

class StringInput
{
  public static void main(String args[])
  {
    String x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter String : ");
    x = in.nextLine();
    System.out.println("Your input in String is : " +x);
  }
}
