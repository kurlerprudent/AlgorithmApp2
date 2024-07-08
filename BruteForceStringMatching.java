import java.util.Scanner;

public class BruteForceStringMatching {
    public void findPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        int n = text.length();
        int m = pattern.length();
        boolean found = false;

        for (int i = 0; i <= n - m; i++) {
            if (text.substring(i, i + m).equals(pattern)) {
                System.out.println("Pattern found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the text.");
        }

        
    }
}