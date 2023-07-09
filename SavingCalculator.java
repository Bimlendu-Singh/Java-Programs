import java.util.Scanner;

class SavingCalculator{
      public static void main(String[] args){
          
           Scanner in = new Scanner(System.in);
           int[] bonus= new int[6];
           int[] savings= new int[6];
           int i;
           float t_bonus=0.0f,t_savings=0.0f;
           float saving_perc;
           
           System.out.println("We will calculate your Saving Percentage in 6 Month");
           System.out.println("\nEnter Your Basic Salary");
           Integer bs = in.nextInt();
           
           for(i=0;i<6;i++)
           {
             System.out.println("Please Enter your Month " +(i+1) +" Bonus : ");
             bonus[i] = in.nextInt();
             t_bonus = t_bonus+bonus[i];
             System.out.println("Please Enter Your Saving of this Month : ");
             savings[i] = in.nextInt();
             t_savings = t_savings+savings[i];
           }
           
           saving_perc = (t_savings/(bs*6+t_bonus))*100;
           System.out.println("Your Saving Percentage is : " +saving_perc);
       }    
}