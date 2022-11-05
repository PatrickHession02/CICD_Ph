package Week6;

import java.util.Scanner;

public class Passenger {
 public Scanner input = new Scanner(System.in);

  public String Title(){
     String Title = input.next();
    return Title;
  }

  public String Name(){
    String Name = input.next();
    return Name;
  }

  public String ID(){
    String ID = input.next();
    return ID;
  }
  public String Phone(){
    String Phone  = input.next();
    return Phone;
  }
  public String Age(){
    String Age = input.next();
    return Age;
  }

}
