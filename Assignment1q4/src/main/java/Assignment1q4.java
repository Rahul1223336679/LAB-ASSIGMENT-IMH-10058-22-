import java.util.Scanner;

public class Assignment1q4 {
    public static void main(String[] args) {
        int[] array = createArray();
        int element = getElementFromUser();
        
        int index = searchElement(array, element);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
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
    
    public static int getElementFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        return element;
    }
    
    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
