package pack2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4000,250, 2019);
        Plane plane = new Plane(60,400);
        Ship ship = new Ship("Port", 2000);
        System.out.println("Car: " + car.price + " " + car.speed + " " + car.year);
        System.out.println("Plane: " + plane.height + " " + plane.countPass);
        System.out.println("Ship: " + ship.port + " " + ship.countPass);
    }
}
