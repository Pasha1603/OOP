package Vehicle;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Car car = new Car("BMW", 265, "95", 4);
        Motorcycle motorcycle = new Motorcycle("Ij", 80, "92", 23);
        Truck truck = new Truck("Kamaz", 120, "Disel", 5000);
        while (true) {
            System.out.println("_________________________________");
        System.out.println("Enter vehicle:");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Truck");
        System.out.println("4 - Exit");

            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            if (a == 1) {
                car.displayInfo();
                car.unike();


            }
           else if (a == 2) {
                motorcycle.displayInfo();
                motorcycle.unike();
            }
           else if (a == 3) {
                truck.displayInfo();
                truck.unike();

            }
           else if (a == 4) {
                break;
            }
        }
    }
}
