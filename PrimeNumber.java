import java.util.Scanner;
class PrimeNumber
{
  static public void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int count = 0,i;
    
    System.out.println("Enter to check Whether the no. is prime or not : ");
    int n = in.nextInt();
    
    for(i=2;i<=n/2;i++)            //Put i<= n/2 we have to write assignment operator, to avoid mistake of 4 told to be prime number
    {
      if(n%i==0)
      {
       count++;
       break;
      }
    }
    if(count==0)
    System.out.println(" Number : " +n +" is Prime");
    else
    System.out.println(" Number : " +n +" is Composite or Not Prime");
  } 
}
