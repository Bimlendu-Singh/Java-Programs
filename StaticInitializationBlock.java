//Program for checking use of StaticInitialization Block(S-i-b) ..

public class StaticInitializationBlock
{
    static int x,y;
	
	//Instance initialization Block
    {
        System.out.println(" 1st initialization box is running..");
    }
    
    //Static initialization Block
    static
    {
        System.out.println("Static initializing block in start x is : " +x);
        x=9;
        y=10;
        System.out.println("x and y is : " +x+y);
    }
    
    //Instance initialization Block
    {
        System.out.println("2nd initialization box is running..");
    }
    
    //Constructor with no args
    StaticInitializationBlock()
    {
        System.out.println("Constructor with no args running..");
    }

	//Main method
    public static void main(String[] args)
    {
        StaticInitializationBlock ex = new StaticInitializationBlock();
        StaticInitializationBlock ex1 = new StaticInitializationBlock();
    }
}
