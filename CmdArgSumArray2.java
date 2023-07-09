public class CmdArgSumArray2
{
  public static void main(String args[])
  {
    int i,sum=0;
    int input[] = new int[args.length];

    for(i=0;i<args.length;i++)
    {
	input[i]=Integer.parseInt(args[i]);
        sum = sum + input[i];
    } 

	System.out.println("Sum is : "+sum);
  }
}