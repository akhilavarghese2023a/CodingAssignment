import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create a list to store the elements
        List<Integer> originalList = new ArrayList<>();

        System.out.println("Enter the elements:");

        // Input the elements
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            originalList.add(element);
        }

        // Shuffle the list
        Collections.shuffle(originalList);

        // Print the shuffled list
        System.out.println("Shuffled array:");
        for (int element : originalList) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
