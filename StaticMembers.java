public class StaticMembers{
      public static void main (String args[]){
             
        Check rewind = new Check();
        rewind.blankShow(45);
        Check.blabla=600;
        rewind.zee=850;
        Check.fullShow(70);
        rewind.display();
        Check.sDisplay();   
     }
}

class Check{
 
         int a = 100;
         static int boo = 500;
         private int x ;
         private static int zoo;
         static int blabla;
         int zee ;
         
         void blankShow(int a){
           x = a;
         }
	    static void fullShow(int blue){
	      zoo = blue;
	    }
	    void display(){
	      System.out.println(a);
	      System.out.println(x);  
	      System.out.println(zee);  	        
	    }
          static void sDisplay(){
	      System.out.println(boo);
	      System.out.println(zoo); 
	      System.out.println(blabla); 
	    }
}

