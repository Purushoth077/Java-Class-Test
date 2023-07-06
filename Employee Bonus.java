import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the employee's salary: $");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the employee's grade (A/B): ");
        String grade = scanner.next().toUpperCase();
        
        double bonusPercentage;
        
        if (grade.equals("A")) {
            bonusPercentage = 5.0;
        } else if (grade.equals("B")) {
            bonusPercentage = 10.0;
        } else {
            System.out.println("Invalid grade entered!");
            return;
        }
        
        if (salary < 10000) {
            bonusPercentage += 2.0;
        }
        
        double bonus = salary * (bonusPercentage / 100);
        double totalSalary = salary + bonus;
        
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);
    }
}