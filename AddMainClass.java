//Program to make objects and how to invoke them.

import java.util.*;   //Importing all classes of util packages but used only Scanner class

class Add             //Class Add
{
    Scanner in = new Scanner(System.in);
    int a,b; 
  											//Bheem's Code 18/7/21
    //Input method	  
    void input()
    {
      System.out.println("Enter two Number : ");
      a = in.nextInt();
      b = in.nextInt();
    }
    //Display method
    void display()
    {
      System.out.println("Sum of two number is : " +(a+b));
    } 
}

class AddMainClass      // Class containing main Method..
{
  public static void main(String args[])
   {
    Add pingpong = new Add();            //Here, pingpong is the object of Add class
  
    pingpong.input();                    //Calling input method of pingpong object
    pingpong.display();			    //Calling display method of pingpong object
   } 
}