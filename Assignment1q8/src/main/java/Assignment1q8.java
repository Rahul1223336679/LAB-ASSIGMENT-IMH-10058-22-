import java.util.Scanner;

public class Assignment1q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        
        int peak = findPeakElement(array);
        
        if (peak != -1) {
            System.out.println("Peak element in the array: " + array[peak]);
        } else {
            System.out.println("No peak element found in the array.");
        }
    }
     public static int findPeakElement(int[] array) {
        int n = array.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || array[mid] >= array[mid - 1]) &&
                (mid == n - 1 || array[mid] >= array[mid + 1])) {
                return mid;
            }
            if (mid < n - 1 && array[mid + 1] > array[mid]) {
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }
        return -1;
    }
}
