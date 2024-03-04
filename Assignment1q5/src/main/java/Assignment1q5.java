import java.util.*;
interface DuplicateObserver {
    void update(int element, int frequency);
}
class IntegerArray {
    private int[] array;
    private List<DuplicateObserver> observers;

    public IntegerArray(int[] array) {
        this.array = array;
        observers = new ArrayList<>();
    }
    public void addObserver(DuplicateObserver observer) {
        observers.add(observer);
    }
    private void notifyObservers(int element, int frequency) {
        for (DuplicateObserver observer : observers) {
            observer.update(element, frequency);
        }
    }
    public void findDuplicates() {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                notifyObservers(entry.getKey(), entry.getValue());
            }
        }
    }
}
class DuplicatePrinter implements DuplicateObserver {
    @Override
    public void update(int element, int frequency) {
        System.out.println("Duplicate element: " + element + ", Frequency: " + frequency);
    }
}
public class Assignment1q5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 5, 6, 2, 7, 8, 2, 3};
        IntegerArray integerArray = new IntegerArray(array);
        DuplicatePrinter duplicatePrinter = new DuplicatePrinter();
        integerArray.addObserver(duplicatePrinter);
        integerArray.findDuplicates();
    }
}
