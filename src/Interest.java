import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a double");
//        double someNum = scanner.nextDouble();
//        System.out.println(someNum);

        System.out.println("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.println("Enter number of months:");
        int month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12;
        }

        System.out.println("Total of interest: " + totalInterest);

    }
}