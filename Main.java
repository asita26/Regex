import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate First Name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (validateInput(firstName, "^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
            return; // Exit if the first name is invalid
        }

        // Validate Last Name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (validateInput(lastName, "^[A-Z][a-zA-Z]{2,}$")) {
            System.out.println("Valid last name!");
        } else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
            return; // Exit if the last name is invalid
        }

        // Validate Email
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        if (validateInput(email, "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]+){2,}$")) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address. Please make sure it follows the specified format.");
        }
    }

    private static boolean validateInput(String input, String regex) {
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(input);

        // Check if the input matches the pattern
        return matcher.matches();
    }
}