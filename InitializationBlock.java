//Program to check instance initialization block and its working , we have use s-i-block also..

public class InitializationBlock
{
    int l,b,h,a;
												//Bheem's code 07/08/21
    //Instance initialization block
    {
        System.out.println("First initialization block we are checking value of l = " +l);
    }

	//Instance initialization block
    {
        l=5;
        b=6;
        h=7;
        System.out.println("After initializing l,b and h is: " +l+b+h);
    }

	//Constructor without args
    InitializationBlock()
    {
        l=8;
        System.out.println("Now constructor is called changed l = " +l);
    }

	//Constructor with args
    InitializationBlock(int b)
    {
        a=b;
        System.out.println("Constructor with argument and value of a is : " +a);
    }

	//Static initialization block
    static
    {
        System.out.println("Static initialization box present mam..");
    }
    //Main method
    public static void main(String[] args)
    {
        InitializationBlock ex = new InitializationBlock();
        InitializationBlock ex2 = new InitializationBlock();
        InitializationBlock ex3 = new InitializationBlock(2);
    }
}
