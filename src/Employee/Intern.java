package Employee;

public class Intern extends employee {
    private int durationInMonth;

    public Intern(String name, String position, int salary, int durationInMonth) {
        super(name, position, salary);
        this.durationInMonth= durationInMonth;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("for 1 project - 5000 Rub.");
        System.out.println("Duration in month:"+ durationInMonth);
        System.out.println("Year salary:" + calculateAnnualSalary() + " Rub.");
    }
    @Override
    public double calculateAnnualSalary(){
        int zp = (int) super.calculateAnnualSalary();
        return ((zp+5000)*durationInMonth)*12;


    }

}
