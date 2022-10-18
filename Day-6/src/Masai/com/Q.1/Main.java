package Masai.com;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JavaBean s1 = new JavaBean();

        s1.setName("Ananya");
        s1.setAge(21);
        s1.setRoll(101);

        int marks = 50;
        s1.setMarks(marks);



        System.out.println("Name : " + s1.getName());
        System.out.println("Age : " + s1.getAge());
        System.out.println("Roll : " + s1.getRoll());
        System.out.println("Marks : " + s1.getMarks());


//		using parameterized constructor
        System.out.println("<*****************************************>");
        JavaBean s2 = new JavaBean(25,"Ajitabh",200,46);
        s2.showDetails();
    }
}
