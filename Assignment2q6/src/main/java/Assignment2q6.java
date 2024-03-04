public class Assignment2q6 {
    // Method overloading with type promotion
    public static void show(int num) {
        System.out.println("Method with int argument: " + num);
    }

    public static void show(float num) {
        System.out.println("Method with float argument: " + num);
    }

    public static void show(double num) {
        System.out.println("Method with double argument: " + num);
    }
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
        float floatValue = 50.5f;
        double doubleValue = 60.6;
        show(byteValue);
        show(shortValue);
        show(intValue);
        show(longValue); 
        show(floatValue);
        show(doubleValue);
    }
}
