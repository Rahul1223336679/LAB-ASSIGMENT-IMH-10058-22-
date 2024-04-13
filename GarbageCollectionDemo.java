class MyClass {
    private int id;

    public MyClass(int id) {
        this.id = id;
    }

    public void showId() {
        System.out.println("ID: " + id);
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Scenario 1: Assigning one reference to another
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = obj1; // Assigning reference of obj1 to obj2

        System.out.println("Scenario 1: Before garbage collection");
        obj1.showId(); // Both references point to the same object
        obj2.showId();

        // Calling garbage collector (may not have immediate effect)
        System.gc();

        System.out.println("\nScenario 1: After garbage collection");
        obj1.showId(); // Both references still point to the same object
        obj2.showId();

        // Scenario 2: Assigning null to both references
        MyClass obj3 = new MyClass(2);
        MyClass obj4 = new MyClass(3);

        obj3.showId(); // Print IDs before null assignment
        obj4.showId();

        obj3 = null; // Assigning null to obj3
        obj4 = null; // Assigning null to obj4

        // Call garbage collector (may not have immediate effect)
        System.gc();

        System.out.println("\nScenario 2: After null assignment and garbage collection");
        // As both references are null, we can't call any methods on them without a null pointer exception
        // Hence, we don't call any methods here
        System.out.println("Objects are null"); // Print suitable message
    }
}
