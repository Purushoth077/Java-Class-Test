import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String input = scanner.nextLine();

        try {
            int decimalNumber = Integer.parseInt(input);

            String binary = convertToBinary(decimalNumber);
            String octal = convertToOctal(decimalNumber);

            System.out.println("Binary equivalent: " + binary);
            System.out.println("Octal equivalent: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }

        scanner.close();
    }

    public static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }

    public static String convertToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal.insert(0, remainder);
            decimalNumber /= 8;
        }

        return octal.toString();
    }
}