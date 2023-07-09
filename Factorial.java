//Program to find the Factorial of the numbers
import java.util.Scanner;

class Factorial
{
    public static void main(String args[]){
        												//Bheem's Code 09/07/21
        Scanner in = new Scanner(System.in);
        int res=1;
        
        //Input
        System.out.println("Enter the Number : ");
        int n = in.nextInt();
        
        int x=n;
        for(;n>0;n--)
        {
          res = res*n;
        }
        
        System.out.println("Factorial of the given number " +x +" is : " +res);
    }
}