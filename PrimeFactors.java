package Masai.com;

public class PrimeFactors {

    public static void main(String[] args) {

        int i = PrimeNumbers();

        if (i >= 2 && i <= 100) {
            for (var j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(j);

                }
            }
        }
        else {
            System.out.println("Invalid Number");
        }

    }

    public static int PrimeNumbers(){
        return 123;

    }

}


