//Создай базовый класс Employee:
//
//name, position, salary
//
//И производные классы:
//
//Manager (доп. поле: bonus)
//
//Developer (доп. поле: programmingLanguage)
//
//Intern (доп. поле: durationInMonths)
//
//Метод calculateAnnualSalary() должен по-разному считать зарплату для каждого типа.


package Employee;

public class employee {
    private String name;
    private String position;
    private int salary;

    public employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;


    }

    public void display() {
        System.out.println("name:" + name);
        System.out.println("Position:" + position);
        System.out.println("Salary in month:" + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;

    }

}
