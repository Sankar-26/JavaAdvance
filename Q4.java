import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Period;

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Read user input
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate birthdate = null;
        try {
            // Parse the input date
            birthdate = LocalDate.parse(input, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period period = Period.between(birthdate, currentDate);

        // Extract years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Output: "+ years +" years, " +months +"months, and " +days +" days.");

    }
}


