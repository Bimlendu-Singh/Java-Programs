//Program to fine area of circle using Class and Objects..

class Circle
{
  private int radius;
          float pivalue,area,circum;

  public void setFunction(int r)
  {
    pivalue=3.14f;
    radius=r;
    circum=2*pivalue*r;  //circum=2*(int)pivalue*r; if we put 'circum' variable in 'int' then we can
                         //do type conversion like this..
   area=pivalue*r*r;
  }

 public void showFunction()
 {
   System.out.println("Given Radius is : " +radius);
   System.out.println("Circumference of the circle is : " +circum);
   System.out.println("Area of the Circle is : " +area);
 }
} 
 
public class ClassObject2
 {
   public static void main(String[] args)
   {
    Circle Calc = new Circle();
    Calc.setFunction(5);
    Calc.showFunction();
   }
 }