package Vehicle;

public class Motorcycle extends vehicle{
    private int horsePower;
    public Motorcycle(String vBrand, int vMaxSpeed, String vFuelType, int horsePower) {
        super(vBrand, vMaxSpeed, vFuelType);
        this.horsePower = horsePower;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Hp:"+ horsePower);
    }
    @Override
    public void unike(){
        super.unike();
        System.out.println("Put on your helmet");

    }
}
