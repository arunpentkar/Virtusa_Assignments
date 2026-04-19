import java.util.Scanner;

public class PasswordValidator {

    // method to check password
    public static boolean checkPassword(String password) {

        boolean hasUpper = false;
        boolean hasDigit = false;

        // condition 1: length
        if (password.length() < 8) {
            System.out.println("Too short (minimum 8 characters)");
            return false;
        }

        // loop through characters
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // feedback
        if (!hasUpper) {
            System.out.println("Missing uppercase letter");
        }

        if (!hasDigit) {
            System.out.println("Missing digit");
        }

        // final check
        return hasUpper && hasDigit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (checkPassword(password)) {
                System.out.println("Valid Password!");
                break;
            } else {
                System.out.println("Try again...\n");
            }
        }

        sc.close();
    }
}