import java.util.Scanner;
public class Assigment1q3 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Original Array:");
        printArray(array);
        int loc = getLocationFromUser(array.length);
        array = deleteElement(array, loc);
        System.out.println("Array after deletion:");
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
    
    public static int getLocationFromUser(int sizeOfArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index position where deletion needs to be performed (0 to " + (sizeOfArray - 1) + "): ");
        int loc = scanner.nextInt();
        while (loc < 0 || loc >= sizeOfArray) {
            System.out.print("Invalid position. Enter a position between 0 and " + (sizeOfArray - 1) + ": ");
            loc = scanner.nextInt();
        }
        return loc;
    }
    
    public static int[] deleteElement(int[] array, int loc) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != loc) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }
}
