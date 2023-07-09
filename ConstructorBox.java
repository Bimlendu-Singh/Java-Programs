//Program making Constructor , then parametrizing it and overloading it..

class ConstructorBox		//Class Name
{
  private int l,b,h;		//Variables Declared
  
  //Constructor with no args.. where assigning length, breadth and height    //Bheem's Code 31/07/21
  public ConstructorBox()
  {
    l=10; b=20; h=30;
    System.out.println("Initialized length , breadth & height is : "+l+" " +b+" " +h);
  }
  
  //Constructor with args.. where passing value to length, breadth and height
  public ConstructorBox(int L, int B, int H)
  {
    l=L; b=B; h=H;
    System.out.println("Passed length , breadth & height is : " +l+" " +b+" " +h+" ");
  }
  
  void parameter()
  {
    System.out.println("Parameter of Box is : " +(l+b+h));
  }
  
  void area()
  {
    System.out.println("Area of Box is : " +(l*b*h));
  }
  
  public static void main(String args[])
  {
    ConstructorBox box = new ConstructorBox();	//Defining box object and invoking constructor with no args
    box.parameter();
    box.area();
    box = new ConstructorBox(2,4,6);	//Again assigning new object to box and invoking Constructor with args
    box.parameter();
    box.area();
  }
}