import java.util.Scanner;
class EoqAndTbo
{
  public static void main(String args[])
  {
      float dmndRate,setpCost,holdingCost,eoq,tbo;
      Scanner in = new Scanner(System.in);
  	
  	 //Input
      System.out.println("To Check Economic order Quantity and Time b/w order enter some details..");
      System.out.println("\nEnter demand rate(items per unit time)");
      dmndRate = in.nextInt();
      System.out.println("Enter setup cost(per order)");
      setpCost = in.nextInt();
      System.out.println("Enter holding cost(per item per unit time)");
      holdingCost = in.nextInt();
      
      //Process
      eoq = (2*dmndRate*setpCost)/holdingCost;
      tbo = (2*setpCost)/(dmndRate*holdingCost);
      
      //Display
      System.out.println("Economic Order Qunatity for a single item is : " +Math.sqrt(eoq));
      System.out.println("Optimal time between order is : " +Math.sqrt(tbo));
      
  }
}