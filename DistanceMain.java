import java.util.Scanner;

class Distance
{
  int t;
  float u,a,dist;
  Scanner in = new Scanner(System.in);
  
  void input()
  {
    System.out.println("Enter initial velocity in 'm/s' : ");
    u = in.nextFloat();
    System.out.println("Enter acceleration in 'm/s^2' : ");
    a = in.nextFloat();
    System.out.println("Enter the time interval in 's' : ");
    t = in.nextInt();
  }
  void process()
  {
    dist = (u*t)+((a*t*t)/2);
    System.out.println("Distance travelled by veichle is : " +dist +"meter");
  } 
}

class DistanceMain
{
  public static void main(String args[])
  {  
     Scanner in = new Scanner(System.in);
     Distance obj = new Distance();  
     int ch;

     System.out.println("To check distance travelled by veichle plz provide some details");
          
      do 
      {
        obj.input();
        obj.process();
        System.out.println("To check again press key 9 or press any other key to exit : ");
        ch = in.nextInt();
      }while(ch==9);
  }
}