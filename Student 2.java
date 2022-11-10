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

    int roll;
    String name;
    int marks;

    void displayStudentDetails() {
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);


    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1 = new Student();
        s1.roll=1032;
        s1.name="Ajitabh";
        s1.marks=95;
        s1.displayStudentDetails();

        Student s2=new Student();

        s2.roll=1033;
        s2.name="Annis";
        s2.marks=80;
        s2.displayStudentDetails();

        s1=null;
        s2=null;
        System.out.println(s1);
        System.out.println(s2);

    }


//    int roll = 12;
//    String name = "Ajitabh";
//    int marks = 456;
//
//    void displayStudentDetails(){
//
//        System.out.println(this.roll);
//        System.out.println(this.name);
//        System.out.println(this.marks);
//    }
//
//    public static void main(String[] args) {
//        Student obj = new Student();
//
//        obj.displayStudentDetails();
//    }
}
