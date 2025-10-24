package Employee;

public class Manager extends employee {
    private double bonus;
    private double sellInYear;

    public Manager(String name, String position, int salary, double bonus,double sellInYear) {
        super(name, position, salary);
        this.bonus = bonus;
        this.sellInYear=sellInYear;


    }

    @Override
    public double calculateAnnualSalary() {
        double zp = super.calculateAnnualSalary();
        return zp + bonus+((sellInYear*2)/100);

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Sell in year:"+ sellInYear+" Rub.");
        System.out.println("Bonus:"+bonus+" Rub.");
        System.out.println("Year salary:" +calculateAnnualSalary()+ " Rub.");

    }

}
