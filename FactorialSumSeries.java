//Program to find the sum of series sum= 1!/1 + 2!/2 + 3!/3 +4!/4 +...+n!/n

import java.util.Scanner;
class FactorialSumSeries
{											//Bheem's Code 11-08-21
   public static void main(String args[])
   {
     int fact,sum=0,i,x,n,k;   			//All the required variables declared here
     Scanner in = new Scanner(System.in);
     
     //Input
     System.out.println("Enter the value to find the required factorial sum : ");
     x = in.nextInt();
     
     /*Loop to find the required sum of the series
     Initialising loop from 1 and running it till 'i' become 'x'(entered value)*/
     for(i=1;i<=x;i++)  
      {
       //Outer for loop- Idea is to find factorial one by one(from 1 to value of x)
        fact=1;
        n=i;	    
        k=i;			//Intializing k , so in last we can divide it to the factorial
       //Inner for loop- This loop is to find factorial.. 
        for(;n>1;n--)
        {
          fact=fact*n;
        }
        sum = sum+(fact/k);   //Finally doing the sum of series with required factorial & divison
      }
    
     //Output
     System.out.println("Required factorial sum of series is : " +sum); 
   }
}