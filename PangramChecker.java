import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkIfPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        scanner.close();
    }

    // Function to check if a sentence is a pangram
    public static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        // Check if the set contains all 26 letters
        return alphabetSet.size() == 26;
    }
}
