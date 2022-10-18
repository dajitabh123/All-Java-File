package Masai.com;

public class Car {

    String model;
    String companyName;
    String color;
    Enginee engine=new Enginee();


    Car(){

    }
    public Car(String model,String companyName,String color,Enginee e) {
        this.model=model;
        this.companyName=companyName;
        this.color=color;
        this.engine=e;

    }
}
