import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Concatenate the strings
        String concat1 = str1.concat(str2);
        String concat2 = str2.concat(str1);

        // Check if the concatenated strings are alternating
        boolean isAlternating = true;
        for (int i = 0; i < concat1.length(); i++) {
            if (i % 2 == 0) {
                if (concat1.charAt(i) != str1.charAt(i/2) || concat2.charAt(i) != str2.charAt(i/2)) {
                    isAlternating = false;
                    break;
                }
            } else {
                if (concat1.charAt(i) != str2.charAt(i/2) || concat2.charAt(i) != str1.charAt(i/2)) {
                    isAlternating = false;
                    break;
                }
            }
        }

        // Print the result
        if (isAlternating) {
            System.out.println("The concatenated strings are alternating.");
        } else {
            System.out.println("The concatenated strings are not alternating.");
        }
    }
}
