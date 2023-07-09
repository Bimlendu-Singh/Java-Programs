import java.util.Scanner;

class FloatInput
{
  public static void main(String args[])
  {
    Float x;
    Float y = 2.4f;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Number : ");
    x = in.nextFloat();
    System.out.println("Your input in Float is : " +x +" And initialise value in Float is : " +y);
  }
}
