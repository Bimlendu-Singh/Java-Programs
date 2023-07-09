//Program for Multiple choie Quention

import java.util.Scanner;

public class JavaQuestion					     //Bheem's Original Program 11/07/21
{										//All Copyright reserves
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int Marks=0;
        int Right = 0;
        int Wrong = 0;

        System.out.println("Please Enter Your Good Name : ");
        String Name = in.nextLine();
        System.out.println("\nWelcome to the Java Questions Ceremony");
        System.out.println("\nHere we are Going to ask You 10 objective question Please read the Question carefully" +
                " and then choose one option among four .");
        System.out.println("\nEach correct answer carry 4 Marks and Each wrong answer carry negative -1 marks");
        System.out.println("\nYou have to choose option by Entering either A,a or B,b or C,c or D,d\n");

        System.out.println("\nQuestion 1) Which of the following option leads to the portability and security of Java?\n" +
                "\n" +
                " a) Bytecode is executed by JVM\n" +
                " b) The applet makes the Java code secure and portable\n" +
                " c) Use of exception handling\n" +
                " d) Dynamic binding between objects"
                +" \nChoose Your Option : ");
        //String qn1Answer = new String("a");   //Putting Correct Answer in qn1Answer String dynamically
        String qn1Answer = "a";                 //Putting Correct Answer in String qn1Answer direct
        String userQn1Answer = in.next();            //Taking Answer from the user in String userQn1Answer

        if(qn1Answer.equalsIgnoreCase(userQn1Answer))   //Comparing the String if it's True it will enter if Block
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 2) Which of the following is not a Java features?\n" +
                "\n" +
                " a) Dynamic\n" +
                " b) Architecture Neutral\n" +
                " c) Use of pointers\n" +
                " d) Object-oriented");

        String qn2Answer = new String("c");
        String userQn2Answer = in.next();

        if(qn2Answer.equalsIgnoreCase(userQn2Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 3 ) What does the expression float a = 35 / 0 return?\n" +
                "\n" +
                " a) 0\n" +
                " b) Not a Number\n" +
                " c) Infinity\n" +
                " d) Run time exception");

        String qn3Answer = new String("c");
        String userQn3Answer = in.next();

        if(qn3Answer.equalsIgnoreCase(userQn3Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 4) _____ is used to find and fix bugs in the Java programs.\n" +
                "\n" +
                " a) JVM\n" +
                " b) JRE\n" +
                " c) JDK\n" +
                " d) JDB\n");

        String qn4Answer = new String("d");
        String userQn4Answer = in.next();

        if(qn4Answer.equalsIgnoreCase(userQn4Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 5) Which of the following is a valid declaration of a char?\n" +
                "\n" +
                " a) char ch = '\\utea';\n" +
                " b) char ca = 'tea';\n" +
                " c) char cr = \\u0223;\n" +
                " d) char cc = '\\itea';");

        String qn5Answer = new String("a");
        String userQn5Answer = in.next();

        if(qn5Answer.equalsIgnoreCase(userQn5Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 6) What is the return type of the hashCode() method in the Object class?\n" +
                "\n" +
                " a) Object\n" +
                " b) int\n" +
                " c) long\n" +
                " d) void");

        String qn6Answer = new String("b");
        String userQn6Answer = in.next();

        if(qn6Answer.equalsIgnoreCase(userQn6Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 7) Evaluate the following Java expression, if x=3, y=5, and z=10:\n" +
                "\n" +
                "++z + y - y + z + x++\n" +
                "\n" +
                " a) 24\n" +
                " b) 23\n" +
                " c) 20\n" +
                " d) 25\n");

        String qn7Answer = new String("d");
        String userQn7Answer = in.next();

        if(qn7Answer.equalsIgnoreCase(userQn7Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 8) Which of the following for loop declaration is not valid?\n" +
                "\n" +
                " a) for ( int i = 99; i >= 0; i / 9 )\n" +
                " b) for ( int i = 7; i <= 77; i += 7 )\n" +
                " c) for ( int i = 20; i >= 2; - -i )\n" +
                " d) for ( int i = 2; i <= 20; i = 2* i )");

        String qn8Answer = new String("a");
        String userQn8Answer = in.next();

        if(qn8Answer.equalsIgnoreCase(userQn8Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 9) Which method of the Class.class is used to determine the name of a class represented by the class object as a String?\n" +
                "\n" +
                " a) getClass()\n" +
                " b) intern()\n" +
                " c) getName()\n" +
                " d) toString()\n");

        String qn9Answer = new String("c");
        String userQn9Answer = in.next();

        if(qn9Answer.equalsIgnoreCase(userQn9Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        System.out.println("\nQuestion 10) Which package contains the Random class?\n" +
                "\n" +
                " a) java.util package\n" +
                " b) java.lang package\n" +
                " c) java.awt package\n" +
                " d) java.io package");

        String qn10Answer = new String("a");
        String userQn10Answer = in.next();

        if(qn10Answer.equalsIgnoreCase(userQn10Answer))
        {
            Marks = Marks + 4;
            Right = Right + 1;
        }
        else
        {
            Marks = Marks -1;
            Wrong++;
        }

        //Displaying Marks
        System.out.println("\nHey " +Name +" Thanks for Participating in the Contest : ");
        System.out.println("  You did " +Right +" Qn. Right and " +Wrong +" Qn. Wrong :");
        System.out.println("    So You Got " +Marks +" Marks..." );

        float tMarks = 40.0f;
        float PrecenCalcu = (Marks/tMarks)*100;

        if(PrecenCalcu>=80.0)
        System.out.println("\n \tCongratulation!! Buddy You are the Topper.. " +
                "\n \tYou Got : "+PrecenCalcu +" Percentage.. in the Contest");

        else if(PrecenCalcu<80.0&&PrecenCalcu>=50.0)
        System.out.println("\n \tNice Buddy! You Passed in the Contest.." +
                "\n \tYou Got : "+PrecenCalcu +" Percentage.. in the Contest\n");

        else
        System.out.println("\n \tSorry Buddy! You Failed in the Exam.." +
                "\n \tYou Got : "+PrecenCalcu +" Percentage.. in the Contest\n All the Best for Next Time");

    }
}