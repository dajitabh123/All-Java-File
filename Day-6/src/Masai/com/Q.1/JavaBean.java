/*
Create a Java Bean class Student with the following fields :
roll: Integer
name: String
age: Integer
marks: Integer

Make ensure that encapsulation is maintained.
Make validation checks before setting the age and marks of the Student
(i.e. are they in the valid range,18<age<60, 0<marks<500).

Inside a Separate class main method, Create 2 objects of the Student class one by using
the zero-argument constructor and the second by using the parameterized constructor.
Print the details of both the Student objects.

 */

package Masai.com;

public class JavaBean {
    private int roll;
    private String name;
    private int age;
    private int marks;

    public JavaBean() {

    }
    public JavaBean(int roll, String name, int age, int marks){

        this.name = name;
        this.roll = roll;

        if(age>18 && age<60){
            this.age = age;
        }
        if (0<marks && marks<500){
            this.marks = marks;
        }
    }
    public void setAge(int age){
        if(age>18 && age<60) {

            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    public void setMarks(int marks) {
        if(marks>0 && marks<500)
        {
            this.marks = marks;
        }
    }

    public int getMarks() {

        return marks;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setRoll(int roll) {

        this.roll = roll;
    }

    public int getRoll() {

        return roll;
    }

    public void showDetails() {

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Roll is: " + roll);
        System.out.println("Marks is: " + marks);

    }
}
