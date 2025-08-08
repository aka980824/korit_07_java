package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.speed = 150;
        mycar.color = "red";
        mycar.drive();

        Car yourcar = new Car();
        yourcar.speed = 180;
        yourcar.color = "yellow";
        yourcar.brake();

        mycar.displayInfo();
        yourcar.displayInfo();
    }
}
