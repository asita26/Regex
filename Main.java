import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate First Name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (validateFirstName(firstName)) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
            return; // Exit if the first name is invalid
        }

        // Validate Last Name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (validateLastName(lastName)) {
            System.out.println("Valid last name!");
        } else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }
    }

    public static boolean validateFirstName(String firstName) {
        // Define the regular expression pattern for the first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }

    public static boolean validateLastName(String lastName) {
        // Define the regular expression pattern for the last name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(regex);
    }
}
