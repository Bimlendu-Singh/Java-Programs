import java.util.Scanner;

class TryAndCheckContinue
{
    static Scanner in = new Scanner(System.in);
    static int intNumber = 0;
    static float floatNumber = 0.0f;

     		public static void tryinput()
    		{
    		  try
    		  {
          		System.out.println("Enter any Integer Number : ");
          		intNumber = Integer.parseInt(in.nextLine());
          		System.out.println("Enter any float Number :");
          		floatNumber = in.nextFloat();
             }
             catch(Exception e)
        	  {
          		System.out.println("Exception occured... Please Provide required input ");
          		tryinput();
        	  } 
          }
  public static void main(String args[])
  {
         tryinput();        
         System.out.println("Integer Number is : " +intNumber);
         System.out.println("Float Number is : " +floatNumber); 
  }
}
