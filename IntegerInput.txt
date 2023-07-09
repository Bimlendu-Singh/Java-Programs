import java.util.Scanner;

class IntegerInput
{
  public static void main(String args[])
  {
    int x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Number : ");
    x = in.nextInt();
    System.out.println("Your input in Int is : " +x);
  }
}
