public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            // Call method that may throw an exception
            method1();
        } catch (Exception e) {
            // Catch the exception and print the stack trace
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            // Call method that may throw an exception
            method2();
        } catch (Exception e) {
            // Catch the exception, wrap it in a new exception, and throw it again
            throw new Exception("Exception in method1", e);
        }
    }

    public static void method2() throws Exception {
        // Simulate an error condition
        throw new Exception("Exception in method2");
    }
}
