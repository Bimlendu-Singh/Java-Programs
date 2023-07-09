//Program to inherit Saving Account from Parent class Bank Account and also need to add some extra feature in saving account

import java.util.Scanner;
class BankAccounts
{
  int deposit, withdraw;
  float balance = 10000.00f;
  long acc_Num, aadhar_No, mob_No;
  
  Scanner in = new Scanner(System.in);					//Bheem's Code 03/09/21

  //Customer details Input
  void input()
  {
      //Taking Customer Details to Check his/her Identity.      
      System.out.println("\nWelcome to Bank, Please Enter Your Bank Details : \n");
      System.out.println("Enter Your Account Number : ");
      acc_Num = in.nextLong();
      System.out.println("Enter Your Aadhar Number : ");
      aadhar_No = in.nextLong();
      System.out.println("Enter the Mobile Number Linked to your Bank Account : ");
      mob_No = in.nextLong(); 
  }
 
   //Deposit Method
   void deposit()
   {
    System.out.println("Enter the Amount You want to Deposit and put the cash in the machine");
    deposit = in.nextInt();
    balance = balance + deposit;
    System.out.println("You have deposited Rs " +deposit +". And Your Current Balance is Rs " +balance);
   }
   
   //Withdrawl Method
   void withdrawl()
   {
     System.out.println("Enter the Amount You like to Withdraw.");  
     withdraw = in.nextInt();
     if(withdraw<=balance)
     {
     System.out.println("You have Withdrawn, Rs " +withdraw +" from your Account."); 
     balance = balance - withdraw;
     System.out.println("Remaining Balance in Your Account is : " +balance); 
     }
     else
     System.out.println("Insufficient Balance..Your Total Balance is : " +balance);
   }
   
   //Balance Check
   void getBalance()
   {
    System.out.println("Total Balance in Your Account is : " +balance);
   }
   
   //Customer Account Details
   void display()
   {
    System.out.println("\nYour Account Details are..\n");
    System.out.println("Account Number : " +acc_Num);     		 
    System.out.println("Aadhar Number linked to Your Account is : " +aadhar_No);
    System.out.println("Mobile Number linked to Your Account is : " +mob_No);
    System.out.println("Total Amount in Your Account is : " +balance); 
   }
}

class SavingAccount extends BankAccounts
{
   float roi=4.00f, interest;
   int months=6;
   
   //Computing interest
    void addInterest()
   {
     interest = (balance*roi/100)*(months/12.0f);
     balance = balance + interest;
   }
   
   //Customer's Saving account details..
   void display()
   {
    System.out.println("\nYour Saving Account Details are..\n");
    System.out.println("Account Number : " +acc_Num);     		 
    System.out.println("Aadhar Number linked to Your Account is : " +aadhar_No);
    System.out.println("Mobile Number linked to Your Account is : " +mob_No);
    System.out.println("Your rate of interest is "+roi+"% per month");
    System.out.println("You get interest of Rs"+interest+" for "+months+" month on your Balance");    
    System.out.println("Total Amount in Your Account is : " +balance); 
   }
}

class MainBankAccounts
{
   public static void main(String args[])
   {
      int ch;
      Scanner in = new Scanner(System.in);
      SavingAccount obj = new SavingAccount();  //Creating object of Saving Account
      
      obj.input();         //Calling input Method
      obj.addInterest();   //Calling input method to compute interest
      
      //Main menu for Customer choices..
      do
    { 
      //Giving Customer menu-driven choices..      
      System.out.println("\nPress 1 To Check Balance..");
      System.out.println("Press 2 To Deposit Amount..");
      System.out.println("Press 3 To Withdraw Amount..");
      System.out.println("Press 4 To Display Your Account Details..");
      ch = in.nextInt();
      
      switch(ch)
      {
        //Balance Check
        case 1 : obj.getBalance();
                 break;
        
        //Deposit Amount         
        case 2 : obj.deposit();
                 break;
                 
        //Withdrawing Amount
        case 3 : obj.withdrawl();
                 break;
        
        //Customer Account Details         
        case 4 : obj.display();
       		 break;
       		 
         default: System.out.println("Invalid Choice!!!");           		 		   
      }
       //If Customer want to go to main menu..
       System.out.println("\nPress 9 To go to Main Menu Again and any other Number key to Exit");
       ch = in.nextInt();
    }while(ch==9);     
   }
}
