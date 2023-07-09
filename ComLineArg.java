class ComLineArg
{
 public static void main(String args[])
 {
   int sum; 
   int x = Integer.parseInt(args[0]);
   int y = Integer.parseInt(args[1]);
   sum = x+y;
   
   System.out.println("Sum of arg is : " +sum);
 }
}