//Program to Check student Name is on MeritList or Not

import java.util.Scanner;
class Admission 
   {
        String Name;
        int m1, m2, m3, m4, m5;
        float per,tMarks=500.0f;
        Scanner in = new Scanner(System.in);

		   //Input
              void input() 
              {
                System.out.println("Enter Your Name");
                Name = in.next();

                System.out.println("Enter the marks of Subject 1 : ");
                m1 = in.nextInt();

                System.out.println("Enter the marks of Subject 2 : ");
                m2 = in.nextInt();

                System.out.println("Enter the marks of Subject 3 : ");
                m3 = in.nextInt();

                System.out.println("Enter the marks of Subject 4 : ");
                m4 = in.nextInt();

                System.out.println("Enter the marks of Subject 5 : ");
                m5 = in.nextInt();
              }
              
             //Display 
             void meritList() 
             {

                if(m1>100||m2>100||m3>100||m4>100||m5>100) 
                {
                        System.out.println("You have entered invalid marks. Please re-enter all marks properly");
                        input();
                        meritList();
                }
                else if(m1<45||m2<45||m3<45||m4<45||m5<45)
                {
                        System.out.println("Your individual subject marks are less ,You are not eligible as per the guidelines ");
                }
                else
                {
                   per = ((m1+m2+m3+m4+m5)/tMarks)*100.0f;
                   
                       if(per>=80)
                           System.out.println("Hey " +Name+" You got " +per+"%, Your Name will be on MeritList 1");
                       else if(per<80&&per>=60)
                                System.out.println("Hey " +Name+" You got " +per+"%, Your Name will be on MeritList 2");
                       else
                       System.out.println("Hey " +Name+" You got " +per+"%, Your Name will be on MeritList 3 or Later");
              }
            }
  }

public class AdmissionMain
        {
           public static void main(String[] args) 
           {

               int ch;
               Scanner in = new Scanner(System.in);
               System.out.println("Enter Your Details, To check Your Name will be on MeritList or Not");

               do {
                   Admission obj = new Admission();

                   obj.input();
                   obj.meritList();
                   System.out.println("To check again Press 9 and press any other key to exit");
                   ch = in.nextInt();
                  }while(ch==9);
         }
        }
