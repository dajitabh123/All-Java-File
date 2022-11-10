/*
Q3) Create a class Student with 3 instance variables:
     ● roll:int
     ● name:String
     ● marks:int
Create a non-static method inside the Student class:
displayStudentDetails: void
inside the above method print all the details of the student in the following format:
     @ Roll is  :
     @ Name is  :
     @ Marks is :
From the main method of the Student class create 2 Student class objects and set the proper details to both objects and call the above displayStudentDetails method on the both student objects.
After calling the method on both student objects, make both the objects eligible for the garbage collector.
 */

package Masai.com;

public class Student {

    int roll = 12;
    String name = "Ajitabh";
    int marks = 456;

    void displayStudentDetails(int marks){

        System.out.println(this.roll);
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    public static void main(String[] args) {
        Student obj = new Student();

        obj.displayStudentDetails(obj.marks);
    }
}
