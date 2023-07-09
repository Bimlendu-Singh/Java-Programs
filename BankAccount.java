//Program to Show Details of Bank Account after taking some input. We have used do-while loop and switch case in
//this program to make this program menu driven 

import java.util.Scanner;

class BankAccount								
{
  public static void main(String args[])						//Bheem's Code 26-07-21
  {
    Scanner in = new Scanner(System.in);
    int acc_Type, balance = 10000, deposit, withdraw, ch;	//All the Necessary variable
    long acc_Num, aadhar_No;  
    
      //Taking Customer Details to Check his/her Identity.      
      System.out.println("\nWelcome to Bank, Please Enter Your Bank Details : \n");
      System.out.println("Enter Your Account Number : ");
      acc_Num = in.nextLong();
      System.out.println("Press 1 for Current Account or Press 2 for Savings");  
      acc_Type = in.nextInt();
      System.out.println("Enter Your Aadhar Number : ");
      aadhar_No = in.nextLong();
      System.out.println("Thanks for Entering Details Now You Can :");

    do
    { 
      //Giving Customer menu-driven choices..      
      System.out.println("\nPress 1 To Check Balance..");
      System.out.println("Press 2 To Deposit Amount..");
      System.out.println("Press 3 To Withdraw Amount..");
      System.out.println("Press 4 To See Your Account Details..");
      ch = in.nextInt();
      
      switch(ch)
      {
        //Balance Check
        case 1 : System.out.println("Total Balance in Your Account is : " +balance);
                 break;
        
        //Deposit Amount         
        case 2 : System.out.println("Enter the Amount You want to Deposit and put the cash in the machine");
                 deposit = in.nextInt();
                 balance = balance + deposit;
                 System.out.println("You have deposited Rs " +deposit +". And Your Current Balance is Rs " +balance);
                 break;
                 
        //Withdrawing Amount
        case 3 : System.out.println("Enter the Amount You like to Withdraw.");  
                 withdraw = in.nextInt();
                 if(withdraw<=balance)
                 {
                   System.out.println("You have Withdrawn, Rs " +withdraw +" from your Account."); 
                   balance = balance - withdraw;
                   System.out.println("Remaining Balance in Your Account is : " +balance); 
                 }
                 else
                 System.out.println("Insufficient Balance..Your Total Balance is : " +balance);
                 break;
        
        //Customer Account Details         
        case 4 : System.out.println("\nYour Account Details are..\n");
       		 System.out.println("Account Number : " +acc_Num);  
       		 
       		 if(acc_Type == 1)
       		 System.out.println("You have : Current Account");
       		 else if(acc_Type == 2)
       		 System.out.println("You have : Saving Account");
       		 else
       		 System.out.println("Unknown(Type of Account)"); 
       		 
       		 System.out.println("Aadhar Number linked to Your Account is : " +aadhar_No);
       		 System.out.println("Total Amount in Your Account is : " +balance); 
       		 break;
       		 
         default: System.out.println("Invalid Choice!!!");           		 		   
      }
       //If Customer want to go to main menu..
       System.out.println("\nPress 9 To go to Main Menu Again and any other Number key to Exit");
       ch = in.nextInt();
    }while(ch==9);  
  }
}