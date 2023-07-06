import java.util.Scanner;

public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM Balance Calculator");

        int denomination2000 = getDenominationCount(scanner, 2000);
        int denomination500 = getDenominationCount(scanner, 500);
        int denomination200 = getDenominationCount(scanner, 200);
        int denomination100 = getDenominationCount(scanner, 100);

        long totalAmount = calculateTotalAmount(denomination2000, denomination500, denomination200, denomination100);

        System.out.println("Total amount available in ATM: " + totalAmount);

        scanner.close();
    }

    public static int getDenominationCount(Scanner scanner, int denomination) {
        System.out.print("Enter the number of " + denomination + " notes: ");
        int count = scanner.nextInt();

        return count;
    }

    public static long calculateTotalAmount(int denomination2000, int denomination500, int denomination200, int denomination100) {
        long totalAmount = 0;

        totalAmount += denomination2000 * 2000;
        totalAmount += denomination500 * 500;
        totalAmount += denomination200 * 200;
        totalAmount += denomination100 * 100;

        return totalAmount;
    }
}