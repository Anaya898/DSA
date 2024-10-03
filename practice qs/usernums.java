import java.util.Scanner;

public class usernums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;

        while (true) {
            System.out.println("Enter a number (or type 'end' to finish):");

            String input = sc.next();
            
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);

                if (num > 0) {
                    positiveCount++;
                } else if (num == 0) {
                    zeroCount++;
                } else {
                    negativeCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to finish.");
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Zeroes: " + zeroCount);
        System.out.println("Negative numbers: " + negativeCount);

        sc.close();
    }
}
