package Employee;

public class Developer extends employee {
    private String programmingLanguage;

    public Developer(String name, String position, String programmingLanguage, int salary) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming language:" + programmingLanguage);
        System.out.println("Year salary:" + calculateAnnualSalary() + " Rub.");

    }

    @Override
    public double calculateAnnualSalary() {
        return super.calculateAnnualSalary();
    }
}
