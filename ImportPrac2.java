package myuniverse;
import java.util.Scanner;
import mypack1.Calculator;

class ImportPrac2                 //Class containing main method
{
     public static void main(String args[])
      {
        Calculator calc = new Calculator();     //Here, calc is the object of Calculator class
        Scanner in = new Scanner(System.in);    //Here, in is the object of Scanner class
        int ch;

        do
        {  
           //Asking user choice..
    		System.out.println("Enter your choice : ");
    		System.out.println("Press 1 to Add : ");
    		System.out.println("Press 2 to Subtract : ");
    		System.out.println("Press 3 to Multiply : ");
    		System.out.println("Press 4 to Divide : ");   
    		ch = in.nextInt(); 	//Taking user choice in ch variable	
    		    		
    		switch(ch)
    		{       		    
    		    case 1: calc.input();
    		    		 calc.add();
    		    		 break;
    		    
    		    case 2: calc.input();
    		    		 calc.sub();
    		    		 break;
    		    		 
    		    case 3: calc.input();
    		    		 calc.multi();
    		    		 break;
    		    		 
    		    case 4: calc.input();
    		    		 calc.div();
    		    		 break;
    		    		 
    		    default: System.out.println("You have Entered invalid choice..");    		            
    		}
    		System.out.println("To continue press 0 .. ");
    		ch = in.nextInt();
    		
        }while(ch==0);
      }
}
