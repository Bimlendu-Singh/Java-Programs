package myuniverse;

public class CmdArgSumArray{
     public static void main(String[] args)
     {
         int s = 0,i;
         for(i=0;i<args.length;i++)
         {      
           s = s + Integer.parseInt(args[i]);
         }
         System.out.println("Sum is : " +s);
     }
}