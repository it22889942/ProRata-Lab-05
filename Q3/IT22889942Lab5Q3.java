import java.util.Scanner;

public class IT22889942Lab5Q3 {
    // Constants
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final double DISCOUNT_NONE = 0.00;
    static final double DISCOUNT_LOW  = 0.10;   // 3–4 days
    static final double DISCOUNT_HIGH = 0.20;   // 5+ days

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: range 1..31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        // Validation 2: start < end
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;
        if (daysReserved < 3) {
            discountRate = DISCOUNT_NONE;
        } else if (daysReserved <= 4) {       // 3 or 4 days
            discountRate = DISCOUNT_LOW;
        } else {                              // 5 or more
            discountRate = DISCOUNT_HIGH;
        }

        double grossAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double totalAmount = grossAmount - (grossAmount * discountRate);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}