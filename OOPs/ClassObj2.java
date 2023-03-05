package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassAndObj {


    public static void main(String[] args) {
        Disply d = new Disply();
        Scanner scanner = new Scanner(System.in);


        // Handle the input error
        try{

            System.out.println("How many student details you want(1 to 100) : ");
            int numberOfStudent = scanner.nextInt();

            for (int i = 1; i <=numberOfStudent; i++) {
                System.out.println("Student - Input : " + i);
                d.takeInput();

                System.out.println("You Entered : ");
                System.out.println("Student - Output : " + i);
                d.printInput();
            }

            // to find the average age of all student
            double sum = 0;
            for (int i = 0; i <d.list.size(); i++) {
                sum+=d.list.get(i);
            }
            double avg = sum/d.list.size();
            System.out.printf("Total average age of student " + "%.2f",avg);

        }
        catch (Exception e){
            System.out.println("Invalid Input try Again ! Age and number of student must be Integer.");
        }

    }
}


class Disply{

    // created list for strong the age of student
    ArrayList<Double> list = new ArrayList<>();

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

        // adding the age in list
        list.add((double)getAge());
    }


}
