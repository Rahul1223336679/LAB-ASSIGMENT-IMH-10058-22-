import java.util.Scanner;

public class Assigment1q2 {
    public static void main(String[] args) {
        int[] array = createArray();
        int numberOfElement = array.length;
        
        System.out.println("Original Array:");
        printArray(array);
        
        int position = getPositionFromUser(numberOfElement);
        int element = getElementFromUser();
        
        insertElement(array, position, element);
        
        System.out.println("Array after insertion:");
        printArray(array);
    }
    
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        
        return array;
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int getPositionFromUser(int numberOfElement) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position where insertion needs to be performed (0 to " + numberOfElement + "): ");
        int position = scanner.nextInt();
        while (position < 0 || position > numberOfElement) {
            System.out.print("Invalid position. Enter a position between 0 and " + numberOfElement + ": ");
            position = scanner.nextInt();
        }
        return position;
    }
    
    public static int getElementFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();
        return element;
    }
    
    public static void insertElement(int[] array, int position, int element) {
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
    }
}
