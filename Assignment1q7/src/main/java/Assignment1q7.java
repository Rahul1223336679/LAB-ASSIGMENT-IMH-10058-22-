import java.util.*;

public class Assignment1q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        
        int[] originalArray = new int[sizeOfArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.print("Enter the position to divide the array: ");
        int position = scanner.nextInt();
        if (position < 0 || position >= sizeOfArray) {
            System.out.println("Invalid position!");
            return;
        }
        int[] firstPart = Arrays.copyOfRange(originalArray, 0, position);
        int[] secondPart = Arrays.copyOfRange(originalArray, position, sizeOfArray);
        System.out.println("First Part of the Array:");
        printArray(firstPart);
        
        System.out.println("Second Part of the Array:");
        printArray(secondPart);
        checkDuplicates(firstPart);
        checkDuplicates(secondPart);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
  public static void checkDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : array) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate elements in the array: " + duplicates);
        } else {
            System.out.println("No duplicate elements in the array.");
        }
    }
}

