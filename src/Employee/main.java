package Employee;

import java.util.Objects;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Manager manager = new Manager("Anton", "Hr", 80000, 30000, 2000000);
        Developer developer = new Developer("Nikita","Developer","java",120000);
        Intern intern= new Intern("Oleg","intern",0,6);

        System.out.println("Employer:");
        System.out.println("{Anton}");
        System.out.println("{Nikita}");
        System.out.println("{Oleg}");
        Scanner console = new Scanner(System.in);
        String a = console.next();
        if (Objects.equals(a, "anton")||Objects.equals(a, "Anton")){
            System.out.println("__________________________");
            manager.display();
            System.out.println();
            manager.calculateAnnualSalary();

        }
        if (Objects.equals(a, "nikita")||Objects.equals(a, "Nikita")){
            System.out.println("__________________________");
            developer.display();
            System.out.println();
            developer.calculateAnnualSalary();
        }
        if (Objects.equals(a, "oleg")||Objects.equals(a, "Oleg")){
            System.out.println("__________________________");
            intern.display();
            System.out.println();
            intern.calculateAnnualSalary();
        }
        else{
            System.out.println("there is no such employee");

        }


    }
}
