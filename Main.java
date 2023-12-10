import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

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
            return; // Exit if the email is invalid
        }

        // Validate Mobile Number
        System.out.print("Enter your mobile number (e.g., 91 9919819801): ");
        String mobileNumber = scanner.nextLine();

        if (validateInput(mobileNumber, "^\\d{2} \\d{10}$")) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number. Please make sure it follows the specified format (e.g., 91 9919819801).");
            return; // Exit if the mobile number is invalid
        }

        // Validate Password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (validatePassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Please make sure it has a minimum of 8 characters.");
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

    private static boolean validatePassword(String password) {
        // Check if the password has a minimum of 8 characters
        return password.length() >= 8;
    }
}
