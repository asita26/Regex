import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (validateFirstName(firstName)) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }
    }

    public static boolean validateFirstName(String firstName) {
        // Define the regular expression pattern
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(firstName);

        // Check if the first name matches the pattern
        return matcher.matches();
    }
}
