/**
Getter and Setter practices with class and object 
*/

package OOPs;

import java.util.Scanner;

public class ClassAndObj {


    public static void main(String[] args) {
        Disply d = new Disply();

        // Handle the input error
        try{
            d.takeInput();
            d.printInput();
        }
        catch (Exception e){
            System.out.println("Invalid Input try Again ! Age must be Integer.");
        }

    }
}

class Disply{
    //variable declear
    private String name;
    private String rollNo;
    private String gender;
    private int age;

 // getter setter for name
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    // getter setter for roll number

    public String getRollNo(){
        return rollNo;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }

    // getter and setter for gender
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    // getter and setter for age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    // take input
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        name = scanner.nextLine();
        setName(name);

        System.out.println("Enter your roll no : ");
        rollNo = scanner.nextLine();
        setRollNo(rollNo);

        System.out.println("Enter your Gender (Male/Female)  : ");
        gender = scanner.nextLine();
        setGender(gender);

        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        setAge(age);
    }

    // print the input :

    public void printInput(){
        System.out.println("*****************************************");
        System.out.println("Your name is : " + getName());
        System.out.println("Roll no. : " + getRollNo());
        System.out.println("Gender : " + getGender());
        System.out.println("Age : " + getAge());
    }
}
