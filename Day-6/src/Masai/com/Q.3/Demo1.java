package Masai.com;

public class Demo1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student Ajitabh = s1.getStudent(true);



        System.out.println("Name: " + Ajitabh.name);
        System.out.println("Roll: " + Ajitabh.roll);
        System.out.println("Address: " + Ajitabh.address);
        System.out.println("CollegeName: " + Ajitabh.collegeName);


        Student Sumit = s1.getStudent(false);

        System.out.println("Name: " + Sumit.name);
        System.out.println("Roll: " + Sumit.roll);
        System.out.println("Address: " + Sumit.address);
        System.out.println("CollegeName: " + Sumit.collegeName);
    }

}
