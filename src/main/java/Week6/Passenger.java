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

    public String getTitle() {
        return Title;
    }

    public String setTitle(String myTitle) {
        if ("Mr".equalsIgnoreCase(myTitle) || "Ms".equalsIgnoreCase(myTitle) || "Mrs".equalsIgnoreCase(myTitle)) {
            this.Title = myTitle;
        } else {
            throw new IllegalArgumentException("Entered invalid title.");
        }
    }

    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        if (Name.length() > 3) {
            this.Name = Name;
        } else {
            throw new IllegalArgumentException("Entered invalid Name");
        }
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        if (String.valueOf(ID).length() >= 10) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Invalid ID entered");
        }
    }

    public long getphoneNum() {
        return phoneNum;
    }

    public void setphoneNum(long phoneNum) {
        if (String.valueOf(phoneNum).length() >= 7) {
            this.phoneNum = phoneNum;
        } else {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        if (Age >= 16) {
            this.Age = Age;
        } else {
            throw new IllegalArgumentException("Applicant is too young to fly");
        }
    }

}
