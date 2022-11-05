package Week6;

import java.util.Scanner;

public class Passenger {
    String Title;
    String Name;
    int Age;
    long phoneNum;
    long ID;

 public Scanner input = new Scanner(System.in);


 public Passenger(String Title, String Name, int Age, long ID, long phoneNum)   //constructor
 {
     setTitle(Title);
     setName(Name);
     setAge(Age);
     setID(ID);
     setPhone(phoneNum);

 }
  public String getTitle(){
    return Title;
  }

    public String setTitle(String myTitle){
     if("Mr".equalsIgnoreCase(myTitle) || "Ms".equalsIgnoreCase(myTitle) || "Mrs".equalsIgnoreCase(myTitle))
     { 
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
