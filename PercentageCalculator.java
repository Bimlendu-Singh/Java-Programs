//Program to Calculate percentage of Students obtained in Exam

import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);   //Here in is the object to take input from the user 
      Integer i;
      int[] Marks;   //Declaring Marks array which i would like to initalise dynamically
      float obtained_marks=0;

        System.out.println("To calculate Your Percentage in Exam Please Enter : ");
        System.out.println("Number of Subject in the Exam : ");					//Asking user how many subject are there
        int no_subject = in.nextInt(); 								//Taking number of subject as input
        System.out.println("Enter Total Marks of All Subject coming in Exam i.e, Full Marks of n subjects:");
        float t_marks = in.nextFloat();								//Full marks of i subjects					

        Marks = new int[no_subject];    //Initlising Marks array Dynamically

        for(i=0;i<Marks.length;i++)  //Here, we also can write i<no_subject or i<Marks.length	//Marks.length will give no. of element
        {																	// in the Marks Array
            System.out.println("Enter the Marks of subject " +(i+1) +" : ");
            Marks[i] = in.nextInt();
            obtained_marks = obtained_marks + Marks[i];
        }
        
        //Calculating Percentage
        Float Perc = (obtained_marks/t_marks)*100;
	   
	   //Displaying Percentage
        System.out.println("Your Percentage in the Exam is : " +Perc);
    }
}