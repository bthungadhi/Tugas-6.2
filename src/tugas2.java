class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    String getRole() {
        return "Employee";
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("--------------------------");
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 2000000;
    }

    @Override
    String getRole() {
        return "Manager";
    }
}

class Programmer extends Employee {

    Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 1000000;
    }

    @Override
    String getRole() {
        return "Programmer";
    }
}

class Intern extends Employee {

    Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary - 300000;
    }

    @Override
    String getRole() {
        return "Intern";
    }
}

public class tugas2 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new Manager("Alya", 5000000);
        employees[1] = new Programmer("Budi", 4000000);
        employees[2] = new Programmer("Citra", 4500000);
        employees[3] = new Intern("Dina", 2000000);

        double totalPayroll = 0;

        for (Employee e : employees) {
            e.printInfo();
            totalPayroll += e.calculateSalary();
        }

        System.out.println("Total Payroll: " + totalPayroll);
    }
}