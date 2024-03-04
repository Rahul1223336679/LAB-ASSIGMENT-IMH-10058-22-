import java.util.Scanner;
public class Assigment1q1{
    public static void main(String[] args) {
        int[] array = createArray();
        int numberOfElement = array.length;
        System.out.print("Array: ");
        for (int i = 0; i < numberOfElement; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Number of elements: " + numberOfElement);
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
}

