import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First ArrayList of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter the number of integers for the first list: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the integers for the first list:");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        // Second ArrayList of integers
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter the number of integers for the second list: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter the integers for the second list:");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        // Compare the two ArrayLists
        if (list1.equals(list2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }

        // Join the two ArrayLists into a third ArrayList
        ArrayList<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Display the joined ArrayList
        System.out.println("\nJoined ArrayList:");
        System.out.println(joinedList);

        // Check if a value is present in the joined ArrayList
        System.out.print("\nEnter a value to search in the joined ArrayList: ");
        int searchValue = scanner.nextInt();
        if (joinedList.contains(searchValue)) {
            System.out.println("The value " + searchValue + " is present in the joined ArrayList.");
        } else {
            System.out.println("The value " + searchValue + " is not present in the joined ArrayList.");
        }

        scanner.close();
    }
}
