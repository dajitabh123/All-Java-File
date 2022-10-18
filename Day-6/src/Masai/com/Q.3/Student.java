package Masai.com;

public class Student {

    int roll;
    String name;
    String address;
    String collegeName;

    public Student() {

    }
    public Student(int roll,String name,String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }
    public Student(int roll,String name,String address,String collageName) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collegeName = collageName;
    }
    public static Student getStudent(boolean isFromNIT) {

        if(isFromNIT == true)
        {
            Student s1 = new Student(24,"Ajitabh","Delhi");
            s1.collegeName = "NIT";
            return s1;
        }
        else {
            Student s1 = new Student(25,"Sumit","Delhi","IIT");
            return s1;
        }

    }
}
