//Program to find the largest number among two number entered by the user

import java.util.Scanner;    //Importing java.util package and using it's Scanner class

class LargestNumber          //LargestNumber is the class name as well as the File name
{
  public static void main(String args[])
  {
    Scanner i = new Scanner(System.in);        //Giving address of Scanner object to Variable i
    int x,y;                                                         //Bheem's Code 1/7/21
            
    System.out.println("Enter the 1st Number : ");
    x = i.nextInt();                          //Taking Input From user
    
    System.out.println("Enter the 2nd Number : ");
    y = i.nextInt();                          //Taking Input From user

    //Comparing and Printing
    if(x>y)
    System.out.println(x +" is the Greatest number");
    else if (x<y)
    System.out.println(y +" is the Greatest number");
    else
    System.out.println("Both are equal");
  }
}