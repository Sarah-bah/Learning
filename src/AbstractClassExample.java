abstract class Vehicle {
    int no_of_tyre;
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        no_of_tyre=4;
        System.out.println("Car starts with key");
    }

}
class Scooter extends Vehicle{
    @Override
    void start() {
        no_of_tyre=2;
        System.out.println("Scooter starts with kick");

    }
}

public class AbstractClassExample {
    public static void main(String[] args){
        Car c= new Car();
       // c.no_of_tyre=4;
        c.start();
        System.out.println(c.no_of_tyre);
        Scooter s = new Scooter();
       // s.no_of_tyre=2;
        s.start();
        System.out.println(s.no_of_tyre);

    }
}
