//Program to check The number is Armstrong or NOt

import java.util.Scanner;       //Importing Scanner class from Java's Util Package
public class ArmstrongNumber
{
  public static void main(String[] args)        //Bheem's Code 03/07/21
  {
    Scanner in = new Scanner(System.in);      //Here, in is the Scanner object to take input from user
    int r,sum=0,y; 
    
    //Input
    System.out.println("Enter any Number : ");
    int x = in.nextInt();
    
    y = x;
    for(;x>0; )
    {
      r = x%10;
      sum = sum+r*r*r;
      x = x/10;    
    }
    
    //Output
    if(y==sum)
    System.out.println("Given number : " +y +" is an Armstrong Number.." );
    else if(y>999)
    System.out.println("You are exceeding the Given Limit");
    else
    System.out.println("Given number : " +y +" is not an Armstrong Number.." );
  }  
}