import java.util.Scanner;

public class IT24104090Lab5Q3 {

    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startDate, endDate, numDays;
        double totalAmount, discountAmount, discountRate;

        do {
            System.out.print("Enter Start Date (1-31): ");
            startDate = scanner.nextInt();
            System.out.print("Enter End Date (1-31): ");
            endDate = scanner.nextInt();

            if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
                System.out.println("Error: Start and end dates must be between 1 and 31.");
            } else if (startDate >= endDate) {
                System.out.println("Error: Start date must be less than end date.");
            } else {
                break; 
            }
        } while (true);

        numDays = endDate - startDate + 1;

        if (numDays < 3) {
            discountRate = 0.0;
        } else if (numDays <= 4) {
            discountRate = 0.1;
        } else {
            discountRate = 0.2;
        }

        totalAmount = numDays * ROOM_CHARGE_PER_DAY;
        discountAmount = totalAmount * discountRate;
        totalAmount -= discountAmount;

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + numDays);
        System.out.printf("Total Amount to be Paid: Rs %.2f\n", totalAmount);
    }
}