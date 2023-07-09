public class WrapperClassPrac{

      public static void main (String args[]){
            
         int a=100;
         Integer zoo = a;
         Integer bla = 500;
         int b = bla;
         int ab = 300;
         Integer blue = Integer.valueOf(b);
         Integer heaven = 1000;
         int bd = heaven.intValue(); 
         
         System.out.println(" a is : "  +a);  
         System.out.println(" zoo is : "  +zoo);  
         System.out.println(" bla is : "  +bla);  
         System.out.println(" ab is : "  +ab);  
         System.out.println(" blue is : "  +blue);  
         System.out.println(" heaven is : "  +heaven);  
         System.out.println(" bd is : "  +bd);  
      }
}