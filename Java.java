/*
Q4) Write a non-static method inside a java class that accepts a whole number and prints the same number,
    if the input is Odd. If the input is even, it should print the next multiple of ten. If the input is
    negative, print the string: “Error”.Call this method from your main method and observe the output.

============================================\\\\\\\\\\
Sample Output:                                      \\\\\\\\\\
==============================================================\\\\\\\\\\\
Input: 44, output: 50    ;                                             \\\\\\\\\\\
Input: 45, output: 45    ;                                                       \\\\\\\\\\\
Input: -5, output: Error ;                                                                \\\\\\\\\\\
===================================================================================================\\\\\\\\\\\
*/
package Masai.com;

public class Java {
    //Write a non-static method inside a java class
    int num;
    void checkWholeNum(int num){
        // If the input is Odd.
        if(num >= 0 && num % 2 !=0){

            System.out.println(num);
        }
        // If the input is even
        else if(num >= 0 && num % 2 == 0){

            System.out.println(num -(num%10)+10);
        }
        else
        {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        Java obj = new Java();

        obj.num = 44;
        obj.checkWholeNum(obj.num);

        obj.num = 45;
        obj.checkWholeNum(obj.num);

        obj.num = -5;
        obj.checkWholeNum(obj.num);

    }
}
