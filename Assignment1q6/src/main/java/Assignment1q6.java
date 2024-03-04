import java.util.*;
public class Assignment1q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        
        int[] originalArray = new int[sizeOfArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            originalArray[i] = scanner.nextInt();
        }
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }
        
        int[] oddArray = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            oddArray[i] = oddList.get(i);
        }
        System.out.println("Original Array:");
        printArray(originalArray);
        
        System.out.println("Even Array:");
        printArray(evenArray);
        
        System.out.println("Odd Array:");
        printArray(oddArray);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
