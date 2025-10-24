package Vehicle;

public class Car extends vehicle {
    private int numberOfDoors;
    public Car(String vBrand, int vMaxSpeed, String vFuelType, int numberOfDoors) {
        super(vBrand, vMaxSpeed, vFuelType);
        this.numberOfDoors = numberOfDoors;

    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of doors:"+ numberOfDoors);
        System.out.println("Type vehicle: passenger car");
    }

    @Override
    public void unike() {
        super.unike();
        System.out.println("Fasten your seat belts before driving");
    }
}
