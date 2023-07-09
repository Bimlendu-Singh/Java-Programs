import java.util.Scanner;
class Palindrome
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num,sum=0,r;
    
    System.out.println("Enter Number to check Whether it is Palindrome or not : ");
    int n = in.nextInt();
    
    num=n;
    for(;n>0;)
    {
      r=n%10;
      sum=sum*10+r;
      n/=10;
    }
    if(num==sum)
    System.out.println("Given Number : " +num +" is a Palindrome");
    else
    System.out.println("Given Number : " +num +" is not a Palindrome");
  }
}