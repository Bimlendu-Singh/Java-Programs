class MainMethodClassCalling
{
  void display(){
    System.out.println("You are in display method..");
  }
  
  public static void main(String args[]){
     
    MainMethodClassCalling call = new MainMethodClassCalling();
    call.display();
  }
}
