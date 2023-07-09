//Program to Giving discount to customer as per their Purchase
import java.util.Scanner;

class CustomerDiscount
{
    //Declaring all the required variables
    static int i, j, millCloth, hLoomCloth;
    static float discM_Per, discH_Per ,discMill, discHloom, payBill, tAmount,tDiscount;

    //Method for Calculating Discount in Mill Cloth
    static float discMillCalc(float x)
    {
      discM_Per = x;
      float disc = (discM_Per/100)*millCloth;
      return (disc);
    }
    
    //Method Calculating Discount in HandLoom items
    static float discHloomCalc(float y)
    {
      discH_Per = y;
      float disc = (discH_Per/100)*hLoomCloth;
      return (disc);
    }

  public static void main(String args[])
  {
    
    Scanner in = new Scanner(System.in);
    
    //Input   
    System.out.println("Enter Purchase Amount of Mill Cloth : ");
    millCloth = in.nextInt();
    
    //Input
    System.out.println("Enter Purchase Amount of HandLoom Cloth : ");
    hLoomCloth = in.nextInt();
    
    //Total Purchase Amount
    tAmount = millCloth+hLoomCloth;
    
    //Condition checking for giving discount on Mill Cloth
    if(millCloth>=0&&millCloth<=100)
       i=1;
    else if(millCloth>100&&millCloth<=200)
       i=2;
    else if(millCloth>200&&millCloth<=300)
       i=2;
    else
       i=4;
       
    //Condition checking for giving discount on Handloom Cloth
    if(hLoomCloth>=0&&hLoomCloth<=100)
       j=1;
    else if(hLoomCloth>100&&hLoomCloth<=200)
       j=2;
    else if(hLoomCloth>200&&hLoomCloth<=300)
       j=3;
    else
       j=4;
                
    //Getting Discount of Mill Cloth as per the Purchase Amount
    switch(i)
    {
      case 1 : discMill = discMillCalc(0.0f);
               break;
      
      case 2 : discMill = discMillCalc(5.0f);
               break;
      
      case 3 : discMill = discMillCalc(7.5f);
               break;
               
      default : discMill = discMillCalc(10.0f);               
    }
    
    //Getting Discount of HandLoom Cloth as per the Purchase Amount
    switch(j)
    {
      case 1 : discHloom = discHloomCalc(5.0f);
               break;
      
      case 2 : discHloom = discHloomCalc(7.5f);
               break;
      
      case 3 : discHloom = discHloomCalc(10.0f);
               break;
               
      default : discHloom = discHloomCalc(15.0f);               
    }
     //Calculating Total Discount and the Final Amount Customer have to pay
     tDiscount = discMill + discHloom;
     payBill = tAmount - tDiscount;
     
     //Display
     if(discMill>0&&discHloom==0)
     {
       System.out.println("Total Purchasing Amount is Rs: "+tAmount);
       System.out.println("You got : "+discM_Per+"% discount in Mill Cloth");
       System.out.println("Final Amount you have to pay is Rs: " +payBill);
     }     
     else if(discMill==00&&discHloom>0)
     {
       System.out.println("Total Purchasing Amount is : "+tAmount);
       System.out.println("You got : "+discH_Per+"% discount in HandLoom items");
       System.out.println("Final Amount you have to pay is Rs: " +payBill);
     }
     else if(discMill>0&&discHloom>0)
     {
       System.out.println("Total Purchasing Amount is Rs: "+tAmount);
       System.out.println("You got : "+discM_Per+"% discount in Mill Cloth "+discH_Per+"% discount in HandLoom items");
       System.out.println("Final Amount you have to pay is Rs: " +payBill);
     }
     else
       System.out.println("You got 0% discount and Final amount you have to pay is Rs: " +payBill);
     
  }
}