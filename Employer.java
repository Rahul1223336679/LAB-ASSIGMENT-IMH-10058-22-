class Employee {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void showNextId() {
        System.out.println("Next employee ID: " + nextId);
    }
}

class Intern extends Employee {
    public Intern(String name, int age) {
        super(name, age);
        System.out.println("New intern added:");
        displayInfo();
        showNextId();
    }

    @Override
    public void displayInfo() {
        System.out.print("Intern: ");
        super.displayInfo();
    }
}

public class Employer {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice", 30);
        Employee emp2 = new Employee("Bob", 25);

        // Display employee information
        System.out.println("Employee details before intern:");
        emp1.displayInfo();
        emp2.displayInfo();

        // Create intern
        Intern intern = new Intern("Charlie", 22);

        // Display employee information after adding intern
        System.out.println("\nEmployee details after intern:");
        emp1.displayInfo();
        emp2.displayInfo();

        // Display next employee ID
        Employee.showNextId();

        // Call garbage collector
        System.gc();

        // Display final employee count after intern has left
        System.out.println("\nFinal employee count after intern has left:");
        Employee.showNextId();
    }
}
