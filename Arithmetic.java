//Program to do Arithmetic operation like add,subtract,multiplication,division...

public class Arithmetic
{
 public static void main(String[] args)
 {                                                                             //Bheem's Code 23/06/21
   
   int a=55,b=44,add,div,multi,sub;

   add=a+b;
   sub=a-b;
   multi=a*b;
   div=a/b;

   System.out.println("Sum of a and b is : " +add);
   System.out.println("Difference of a and b is : " +sub);
   System.out.println("Multiplication of a and b is : " +multi);
   System.out.println("Division of a and b is : " +div);
   System.out.println("Sum, diff, multi , and division of a and b is " +add +" " +sub +" " +multi +" " +div);
   System.out.println("Sum is " +add +" Div is " +div +" Multi is " +multi +" Sub is " +sub); 
 }
}