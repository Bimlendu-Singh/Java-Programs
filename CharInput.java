import java.util.Scanner;

class CharInput
{
  public static void main(String args[])
  {
    char x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Character : ");
    x = in.next().charAt(0);
    System.out.println("Your input in Char is : " +x);
  }
}
