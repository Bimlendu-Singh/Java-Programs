import java.util.Scanner;

public class Sum
{								//Why two Public class in one java file not allowed?
  int a,b;
  Scanner in = new Scanner(System.in);
  
  void input()
  {
    System.out.println("Enter two Number : ");
    a = in.nextInt();
    b = in.nextInt();
  }
  void display()
  {
    System.out.println("Sum is : " +(a+b));
  }
}

class PublicCheck
{
  public static void main(String args[])
  {
    Sum add = new Sum();
    add.input();
    add.display();
  }
}
