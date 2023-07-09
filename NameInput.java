package mypack1;
import java.util.Scanner;

public class NameInput{
  
  Scanner in = new Scanner(System.in);
  String Name;
  
  public void input(){
      System.out.println("Plz Enter ur Name : ");
      Name = in.nextLine();
  }
  
  public void display() {
      System.out.println("Your Name is : " +Name);
  }
}