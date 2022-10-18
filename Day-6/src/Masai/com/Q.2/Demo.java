/*
Create a Java class Demo with 4 parameterized constructors as follows:
1. Demo()
2. Demo(String s)
3. Demo(int i)
4. Demo(float f)

Put a statement in all the constructors which will denote it is the part of the respected constructor.
Create a Single java object of the Demo class in such a way that it will call all the 4 Constructors.
 */

package Masai.com;

public class Demo {
    Demo(){
        this(15);
        System.out.println("This is the part of zero-argument constructor");
    }

    Demo(String s){
        this(12f);
        System.out.println("This is the part of string constructor");
    }

    Demo(int i){
        this("Ajitabh");
        System.out.println("This is the part of int constructor");
    }

    Demo(float f){

        System.out.println("This is the part of float constructor");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
    }
}
