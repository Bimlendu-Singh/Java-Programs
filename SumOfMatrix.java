//Sum of two Matrix

import java.util.Scanner;
class SumOfMatrix
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int [][] a = new int[3][3];
      int [][] b = new int[3][3];
      int sum [][] = new int[3][3];
      int i,j;
      												  
      //Input in Matrix a
      System.out.println("Enter the value in Matrix a : ");
      for(i=0;i<3;i++)
        for(j=0;j<3;j++)
           a[i][j] = in.nextInt();
      
      //Input in Matrix b     
      System.out.println("Enter the value in Matrix b : ");
      for(i=0;i<3;i++)
        for(j=0;j<3;j++)
           b[i][j] = in.nextInt();   
      
      //Sum process     
      for(i=0;i<3;i++)
        for(j=0;j<3;j++)
           sum[i][j] = a[i][j]+b[i][j];
      
      //Displaying Matrix a     
      System.out.println("Matrix a is : ");
         for(i=0;i<3;i++)
          {
             System.out.print("\n");
               for(j=0;j<3;j++)
                {
                   System.out.print(" "+a[i][j]);
                }
          }
      
      //Displaying Matrix b    
      System.out.println("\nMatrix b is : ");
         for(i=0;i<3;i++)
          {
             System.out.print("\n");
               for(j=0;j<3;j++)
                {
                   System.out.print(" "+b[i][j]);
                }
          }
      
      //Displaying sum of Matrix    
      System.out.println("\nSum of Matrix is : ");
         for(i=0;i<3;i++)
          {
             System.out.print("\n");
               for(j=0;j<3;j++)
                {
                   System.out.print(" "+sum[i][j]);
                }
          }
   }
}