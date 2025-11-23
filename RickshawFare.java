
/**
 * Write a description of class rickshwafare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

    public class RickshawFare {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inputs from user
        System.out.print("Distance travelled (km): ");
        double km = sc.nextDouble();

        System.out.print("Time taken (minutes): ");
        double minutes = sc.nextDouble();

        System.out.print("Local customer? (yes/no): ");
        String local = sc.next().trim().toLowerCase();

        System.out.print("Night ride? (yes/no): ");
        String night = sc.next().trim().toLowerCase();

        // Basic pricing
        double startPrice = 30;
        double rateKm = 20;
        double rateMin = 1.5;

        // Fare calculation
        double total = startPrice + (km * rateKm) + (minutes * rateMin);

        // Local discount (for long rides only)
        if (local.equals("yes") && km > 10) {
            total = total - (total * 0.10);  // 10% off
        }

        // Night time increase
        if (night.equals("yes")) {
            total = total + (total * 0.20);  // add 20%
        }

        // Output
        System.out.println("\n----------------------------");
        System.out.println("     Rickshaw Fare Bill");
        System.out.println("----------------------------");
        System.out.println("Total Amount: Rs. " + Math.round(total));
        System.out.println("----------------------------");
    }
}