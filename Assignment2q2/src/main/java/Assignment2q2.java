import java.util.Scanner;

public class Assignment2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (validate(name)) {
            System.out.println("Name is valid.");
        } else {
            System.out.println("Invalid name! Name should contain only alphabets.");
        }
        
        if (validate(age)) {
            System.out.println("Age is valid.");
        } else {
            System.out.println("Invalid age! Age should be greater than 3 and less than 15.");
        }
    }
    public static boolean validate(String name) {
        return name.matches("[a-zA-Z]+");
    }
    public static boolean validate(int age) {
        return age > 3 && age < 15;
    }
}
