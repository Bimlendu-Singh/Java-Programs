import java.util.Scanner;

public class TryCatch1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter numerator :");
            int n = sc.nextInt();
            System.out.println("Enter denominator :");
            int d = sc.nextInt();

            int result = n/d;
            System.out.println("Result is : "+result);

        }catch(ArithmeticException e){
            System.out.println("Error: Cannot be divided by 0");
        }catch(Exception e){
            System.out.println("Invalid input. Please enter integers input only");
            System.out.println("e.getMessage : "+e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("Program ended.");
        }
    }
}