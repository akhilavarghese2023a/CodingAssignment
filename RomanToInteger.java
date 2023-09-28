import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = 0;
        int prevValue = 0;

        boolean isValidRomanNumeral = true;

        // Iterate through the Roman numeral from right to left
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            if (!romanValues.containsKey(currentChar)) {
                isValidRomanNumeral = false;
                break;
            }

            int currentValue = romanValues.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        if (isValidRomanNumeral) {
            System.out.println("The integer value is: " + result);
        } else {
            System.out.println("Invalid Roman numeral. Please enter a valid Roman numeral.");
        }

        scanner.close();
    }
}
