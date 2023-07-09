import java.util.Scanner;

class TryAndCheck
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int intNumber = 0;
    float floatNumber = 0.0f;
    
    try
        {
          System.out.println("Enter any Integer Number : ");
          intNumber = Integer.parseInt(in.nextLine());
          System.out.println("Enter any float Number :");
          floatNumber = in.nextFloat();
        }
        
     catch(Exception e)
         {
           System.out.println("Exception occured... Please check input ");
         }
         
     System.out.println("Integer Number is : " +intNumber);
     System.out.println("Float Number is : " +floatNumber);
  }
}