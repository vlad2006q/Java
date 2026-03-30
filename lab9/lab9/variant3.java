class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " manages the team.");
    }
}

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " writes code.");
    }
}

class Designer extends Employee {

    Designer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " designs graphics.");
    }
}

public class variant3 {
    public static void main(String[] args) {

        Manager m = new Manager("Alex", 5000);
        Developer d = new Developer("John", 4000);
        Designer ds = new Designer("Kate", 3500);

        m.work();
        d.work();
        ds.work();
    }
}
