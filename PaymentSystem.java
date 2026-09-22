package paymentprocessingsystem;
import java.util.Scanner;
public class PaymentSystem {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);    
		int choice;

        do {
        	System.out.println("Payment Processing System");
            System.out.println("""
                Pay Bill
                1. Proceed with payment
                2. Cancel
                """);
            System.out.print("Choose option: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Number of customers: ");
                int customers = input.nextInt();

                // System loop to handle customers who are paying 
                for (int i = 1; i <= customers; i++) {
                    System.out.print("Customer " + i + " amount to be paid: ");
                    int amount = input.nextInt();

                    // Amount Input validation
                    while (amount <= 0) {
                        System.out.print("Invalid amount, please enter amount >0ugx: ");
                        amount = input.nextInt();
                    }

                    // Discount given to customer
                    double discount = (amount >= 100000) ? amount * 0.10 : 0;
                    double total_amount = amount - discount;

                    System.out.println("Discount: UGX " + discount);
                    System.out.println("Total pay: UGX " + total_amount);
                }

            } else if (choice != 2) {
                System.out.println("Invalid input, please try again.");
            }
            

        } while (choice != 2);

        System.out.println("Payment process terminated.");
        input.close();

	}

}
