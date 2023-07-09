import java.util.Scanner;

class LongInput
{
  public static void main(String args[])
  {
    long x;
    long y = 35678932L;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Number : ");
    x = in.nextLong();
    System.out.println("Your input in Long is : " +x);
    System.out.println("Your assigned input in long is : " +y);
  }
}
