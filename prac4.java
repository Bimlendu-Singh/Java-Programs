import java.util.Scanner;
public class prac4
{
    static int x,y;
    static Scanner obj = new Scanner(System.in);
    
    static void input()
    {
      System.out.println("Enter any two number : ");
      x = obj.nextInt();
      y = obj.nextInt();
    }  
   static void display()
   {
    System.out.println(x +y);
   }
     
    public static void main(String args[])
    { 
     input();
     display();
    }
}