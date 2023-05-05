import java.util.Scanner;
/*
@author alfonso
 */
public class UserLogin {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();


        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Welcome...");
        } else {
            System.out.println("Incorrect password");
            System.out.print("Do you want to create a new password ? ");
            String response = input.nextLine();
            if ((response.equals("yes")) || (response.equals("Yes"))){
                System.out.println("Set your new password: ");
                password = input.nextLine();
                while (password.equals("java123")) {
                    System.out.println("Your new password cannot be the same as the one you used before.");
                    System.out.println("Set your new password: ");
                    password = input.nextLine();
                }
                System.out.print("Your password has been created and logged in.");

            }
            else {
                System.out.print("You logged out of the system.");

            }
        }
    }
}
