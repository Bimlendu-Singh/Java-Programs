//Checking the largest number among two , taking input from user through CMD

class CmdLargest                          //CMDLargest is class Name as well as file name
{
  public static void main(String args[])  //Main fn. also taking CMD argument
  {                                                           //Bheem's code 1/7/21
   int x = Integer.parseInt(args[0]);     //Converting string into integer type
   int y = Integer.parseInt(args[1]);     //Converting string into integer type

   //Comparing and Printing the Result
   if(x>y)
   System.out.println(x +" is largest");
   else if(x<y)
   System.out.println(y +" is largest");
   else
   System.out.println("Both are equal"); 
  }
}