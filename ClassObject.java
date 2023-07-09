//Progaram to see how to make objects in Java

class Box
{
 private int length,breadth,height;

 public void setDimension(int l, int b, int h)
 {
  length = l;
  breadth = b;
  height = h;
 }

 public void showDimension()
 {
   System.out.println("length is : " +length);
   System.out.println("breadth is : " +breadth);
   System.out.println("height is : " +height);
 }
}

public class ClassObject
{
  public static void main(String[] args)
  {
    Box Dabba = new Box();
    Dabba.setDimension(45,33,77);
    Dabba.showDimension();
  }
}


