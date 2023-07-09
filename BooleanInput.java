import java.util.Scanner;

class BooleanInput
{
  public static void main(String args[])
  {
    boolean x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Number : ");
    x = in.nextBoolean();
    System.out.println("Your input in Boolean is : " +x);
  }
}
