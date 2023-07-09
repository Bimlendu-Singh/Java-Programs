//Program for seeing example of Inheritance..

class Person		//Here, Person is a Parent or SuperClass
{
  private int age;
  private String name;						//Bheem's Code 1/08/21
  
  void setAge(int a)
  { age = a; }
  
  void setName(String b)
  { name = b; }
  
  int getAge()
  { return (age); }
  
  String getName()
  { return (name); }
}

class Student extends Person		//Here, Student is a child class which extends or inheriting
{							//Person class.. So, Person is superclass of Student subclass
  private int rollNo;
  
  void setRollNo(int a)
  { rollNo = a; }
  
  int getRollNo()
  { return (rollNo); }
}
//Class containing main method
public class InheritanceExample		
{
  public static void main(String args[])
  {
    Student st = new Student();  //Making object 'st' of subclass Student
    
    //Calling and Passing all the methods of student class also the inherited methods.. 
    st.setRollNo(6);
    st.setName("Bheem Singh");
    st.setAge(20);
    System.out.println("Name is : " +st.getName());
    System.out.println("Age is : " +st.getAge());
    System.out.println("Roll is : " +st.getRollNo());
  }
}