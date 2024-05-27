import java.util.Scanner;

public class ElectricityBillGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter Service Number: ");
        String serviceNumber = scanner.nextLine();

        System.out.print("Enter Previous Reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter Current Reading: ");
        int currentReading = scanner.nextInt();

        // Calculating the units consumed
        int unitsConsumed = currentReading - previousReading;

        // Calculating the cost based on the units consumed
        double cost;
        if (unitsConsumed < 100) {
            cost = unitsConsumed * 1.0; // Rs.1 per unit for units < 100
        } else if (unitsConsumed < 150) {
            cost = unitsConsumed * 1.5; // Rs.1.5 per unit for units between 100 and 149
        } else if (unitsConsumed < 200) {
            cost = unitsConsumed * 2.0; // Rs.2 per unit for units between 150 and 199
        } else {
            cost = unitsConsumed * 2.5; // Rs.2.5 per unit for units 200 and above
        }

        // Calculating taxes
        double cgst = cost * 0.05; // 5% CGST
        double sgst = cost * 0.15; // 15% SGST

        // Calculating the total amount to pay
        double totalAmount = cost + cgst + sgst;

        // Displaying all the details
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Service Number: " + serviceNumber);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Unitonsumed: " + unitsConsumed);
        System.out.printf("Cost: Rs. %.2f\n", cost);
        System.out.printf("CGST (5%%): Rs. %.2f\n", cgst);
        System.out.printf("SGST (15%%): Rs. %.2f\n", sgst);
        System.out.printf("Total Amount to Pay: Rs. %.2f\n", totalAmount);
    }
}
