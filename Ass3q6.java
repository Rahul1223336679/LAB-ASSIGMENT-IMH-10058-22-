public class Ass3q6 {
    public static void main(String[] args) {
        Ass3q6 demo = new Ass3q6();
        
        // Method invocation with different argument types
        demo.display(10);       // int argument
        demo.display(15L);      // long argument
        demo.display(20.5f);    // float argument
        demo.display(25.75);    // double argument
    }

    // Overloaded methods demonstrating type promotion
    public void display(byte x) {
        System.out.println("byte argument: " + x);
    }

    public void display(short x) {
        System.out.println("short argument: " + x);
    }

    public void display(int x) {
        System.out.println("int argument: " + x);
    }

    public void display(long x) {
        System.out.println("long argument: " + x);
    }

    public void display(float x) {
        System.out.println("float argument: " + x);
    }

    public void display(double x) {
        System.out.println("double argument: " + x);
    }
}
