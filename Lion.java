/*
Q2) Create a class Lion with following members:
● String name;
● boolean isHungry;
● int age;
● static int totalDeaths;
● static printKillings() : void
● thinking() : void
printKillings() should print this ("Total killings by lions in jungle = "+ totalDeaths); Implement thinking() in the following manner-
● ifisHungry=falsethenprintLionNameissleeping;
● if isHungry=true and age>12 then increase the totalDeaths by two and print lionName has eaten two animal
● if isHungry=true and age<=12 and age >=2 then increase the totalDeaths by one and print lionName has eaten one animal
● if isHungry=true and age<2 then print lionName is calling Mom;
Inside the main method of Lion Make 3 objects(lion1, lion2, lion3) of class Lion and assign valid values to
variables and call thinking() for each object. then print totalDeaths by calling printKillings() ;
Sample output-
lion1 has killed two animal lion2 has killed one animal lion is sleeping
Total Killings by lion in jungle 3
Note: This output is just for reference, you can assign any value to the lion object.
 */
package Masai.com;

public class Lion {

    boolean isHungry = false;
    int age = 10;
    static int totalDeaths;

    void printKillings(){
        System.out.println("Total killings by lions in jungle = "+ totalDeaths);
    }
    void thinking(int a,boolean b){
        this.age = a;
        this.isHungry = b;

        if(this.isHungry==false) {
            System.out.println("Lion name is sleeping");

        }else if(this.isHungry == true && this.age>12) {
            this.totalDeaths = this.totalDeaths + 2;
            System.out.println("Lion Name has eaten two animals");

        }else if(this.isHungry == true && age <=12 && age>=2) {
            this.totalDeaths = this.totalDeaths + 1;
            System.out.println("Lion Name has eaten one animal");

        }else if(this.isHungry == true && this.age <=2) {
            System.out.println("Lion Name is Calling Mom");
        }

    }

    public static void main(String[] args) {
        Lion Sher1 = new Lion();
        Lion Sher2 = new Lion();
        Lion Sher3 = new Lion();
        Sher1.thinking(21,true);
        Sher2.thinking(11,true);
        Sher3.thinking(3,false);
        Sher1.printKillings();
        Sher2.printKillings();
        Sher3.printKillings();

    }

}
