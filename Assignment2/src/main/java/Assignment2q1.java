import java.util.Scanner;

public class Assignment2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + calculateArea(length, width));
                System.out.println("Perimeter of the rectangle: " + calculatePerimeter(length, width));
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculateArea(radius));
                System.out.println("Circumference of the circle: " + calculateCircumference(radius));
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + calculateArea(side));
                System.out.println("Perimeter of the square: " + calculatePerimeter(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    // Rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    // Circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double CalculateArea(double side) {
        return side * side;
    }
    
    public static double calculatePerimeter(double side) {
        return 4 * side;
    }
}
