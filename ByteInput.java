import java.util.Scanner;

class ByteInput
{
  public static void main(String args[])
  {
    byte x;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter any Number : ");
    x = in.nextByte();
    System.out.println("Your input in Byte is : " +x);
  }
}