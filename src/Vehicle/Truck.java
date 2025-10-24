package Vehicle;

public class Truck extends vehicle{
    private int loadCapacity;
    public Truck(String vBrand, int vMaxSpeed, String vFuelType, int loadCapacity) {
        super(vBrand, vMaxSpeed, vFuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load capacity:"+loadCapacity);
    }
    @Override
    public void unike(){
        super.unike();
        System.out.println("You full");
    }
}
