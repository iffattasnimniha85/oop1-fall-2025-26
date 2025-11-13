import java.util.Scanner;

public class MortgageCalculator3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = 0;
        int creditScore = 0;
        boolean criminalRecord = false;
        double loanAmount = 0;
        double interestRate = 0;
        int years = 0;

        do {
            System.out.print("Enter your monthly salary: ");
            if (input.hasNextDouble()) {
                salary = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid! Please enter a valid numeric number.");
                input.next();
            }
        } while (true);

        while (true) {
            System.out.print("Enter your credit score (0–500): ");
            if (input.hasNextInt()) {
                creditScore = input.nextInt();
                if (creditScore >= 300 && creditScore <= 500) {
                    break;
                } else {
                    System.out.println("Credit score must be between 300 and 500 to qualify.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                input.next();
            }
        }

        while (true) {
            System.out.print("Do you have a criminal record? (true/false): ");
            if (input.hasNextBoolean()) {
                criminalRecord = input.nextBoolean();
                if (!criminalRecord) {
                    break;
                } else {
                    System.out.println("Sorry, you are not eligible for a loan due to criminal record.");
                    return;
                }
            } else {
                System.out.println("Invalid input! Please enter true or false.");
                input.next();
            }
        }

        double maxLoanAmount = salary * 2;
        while (true) {
            System.out.print("Enter your desired loan amount (max " + maxLoanAmount + "): ");
            if (input.hasNextDouble()) {
                loanAmount = input.nextDouble();
                if (loanAmount > 0 && loanAmount <= maxLoanAmount) {
                    break;
                } else {
                    System.out.println("Loan amount must be positive and not more than 2 times your salary.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
        }

        while (true) {
            System.out.print("Enter annual interest rate (in %): ");
            if (input.hasNextDouble()) {
                interestRate = input.nextDouble();
                if (interestRate > 0 && interestRate <= 100) {
                    break;
                } else {
                    System.out.println("Interest rate must be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
        }

        while (true) {
            System.out.print("Enter loan period in years: ");
            if (input.hasNextInt()) {
                years = input.nextInt();
                if (years > 0) {
                    break;
                } else {
                    System.out.println("Loan period must be positive");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
        }

        double totalInterest = (loanAmount * interestRate * years) / 100;
        double totalPayment = loanAmount + totalInterest;

        System.out.println("\nYour loan is successfully approved!");
        System.out.printf("Interest Amount: ", totalInterest);
        System.out.printf("Total Loan + Interest: ", totalPayment);
    }
}
