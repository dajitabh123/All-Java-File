/*
Q3)
 */
package Masai.com;

import java.util.Scanner;

public class Course {

    //  Q3)  Create a class Course with 3 instance variables:
    //  1. courseId: int
    //  2. courseName: String
    //  3. courseFee: int

    int courseId;
    String courseName;
    int courseFee;

    // Define a non-static method inside the Course class as follows
    public void displayCourseDetails() {
        // displayCourseDetails: void
        // Inside the above method print all the details of the course.

        System.out.println("Course Id is: " + courseId);
        System.out.println("Course Name is: " + courseName);
        System.out.println("Course Fee is: " + courseFee);
        /*Define a static method inside the Course class

        authenticate: void

        This method will take 2 parameters:
        username: String
        password: String
        Implement this authenticates() method as follows:
        If the supplied username is "Admin" and the password is "1234" then inside this method create
        the Course class object by taking details from the user using scanner class. Set the value of
        courseId, courseName, courseFee on that object and call the displayCourseDetails() method on
        that course object. Otherwise, print "Invalid Username or password"
    */
    }
    public static void authenticate(String username, String password) {
        //   Define a static method inside the Course class
        //   authenticate: void

        if(username.equals("Admin") && password.equals("9900"))
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter course id:");
            int id = input.nextInt();

            input.nextLine();
            System.out.println("Enter course name:");
            String name = input.nextLine();

            System.out.println("Enter course fee:");
            int fee = input.nextInt();

            Course c1 = new Course();
            c1.courseId = id;
            c1.courseName = name;
            c1.courseFee = fee;

            c1.displayCourseDetails();

        }
        else
        {
            System.out.println("Invalid Username or password");
        }

    }
    public static void main(String[] args) {


        Course.authenticate("Admin", "9900");
        Course.authenticate("Ajitabh Dash", "1212");

        //   Define the main method inside the Course class and call to authenticate() method 2 times first
        //   time with a valid username and password and the second time with an invalid username and
        //   password.

    }

}
