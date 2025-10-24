//Создай базовый класс Vehicle с полями:
//
//brand (марка)
//
//maxSpeed (максимальная скорость)
//
//fuelType (тип топлива)
//
//И производные классы:
//
//Car (доп. поле: numberOfDoors)
//
//Motorcycle (доп. поле: hasSidecar)
//
//Truck (доп. поле: loadCapacity)
//
//У всех классов должен быть метод displayInfo().
package Vehicle;

public class vehicle {
    private String brand;
    private int maxSpeed;
    private String fuelType;
    public vehicle( String vBrand, int vMaxSpeed, String vFuelType){
        this.brand= vBrand;
        this.maxSpeed= vMaxSpeed;
        this.fuelType= vFuelType;



    }
    public void displayInfo(){
        System.out.println("Brand:"+brand);
        System.out.println("Max speed:"+ maxSpeed+ "km/h");
        System.out.println("Fuel type:"+ fuelType);
    }
    public void unike(){
        System.out.println("Start engine");
    }
}
