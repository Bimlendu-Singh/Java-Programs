class Personal
{
  String name;
  long acc_no;
  String pan;
  float basic_Pay;
  
  //Prametrized Constructor 
  Personal(String n, String p, float bp, long acc)
  {
    name = n;
    pan = p;
    basic_Pay = bp;
    acc_no = acc;
  }
  
  void display()
  {
    System.out.println("\nEmploye Name : " +name);
    System.out.println("Pan Number : " +pan);
    System.out.println("Account Number : " +acc_no);
    System.out.println("Basic Salary : Rs" +basic_Pay);
  } 
}

//Retire Class
class Retire extends Personal
{
  int yrs;
  float pf , grat ;
  String gratamnt = "Nil";
  
  //Parametrized constructor
  Retire(String n, String pann, float bp, long acc, int y)
  {
    super(n,pann,bp,acc);
    yrs = y;
  }
  
  //Method to calculate gratituity amount
  void gratituity()
  {
    if(yrs>=10)
     {
        grat = 12*basic_Pay;
        System.out.println("Gratuity amount : Rs" +grat);
     }
    else
        System.out.println("Gratuity amount : " +gratamnt);
  }
  
  //Method to calculate provident fund
  void provident()
  {
    pf = (2/100.0f*basic_Pay)*yrs;
    System.out.println("Provident fund amount(Pf) : Rs" +pf);
  }
  
  //Display  
  void display1()
  {
    display();
    System.out.println("Years of service : " +yrs);
    provident();
    gratituity();
  }
} 

//Main Class
class RetireMain
{
   public static void main(String[] args)
   {
      Retire obj = new Retire("Bheem","PF2AJ4654674",90000.0f,5656565656L,8);
      obj.display1();
   }
}