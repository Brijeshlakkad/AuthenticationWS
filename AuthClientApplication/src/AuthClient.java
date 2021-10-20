/**
 * Developed to present JAX-WS usage for Distributes Systems (SOEN 423) course.
 * Developed by Brijesh Lakkad
 *
 * @author brijeshlakkad
 */

import client.Authentication;
import client.AuthenticationImplService;

import java.util.Scanner;

public class AuthClient {

    public static void main(String[] args) {
        AuthenticationImplService service = new AuthenticationImplService();
        Authentication auth = service.getAuthenticationImplPort();

        Scanner kbd = new Scanner(System.in);
        boolean isLoggedIn = false;
        int maxTries = 3;
        int tryCount = 0;
        while (tryCount < maxTries) {
            System.out.println("Enter username:");
            String username = kbd.next();

            System.out.println("Enter password:");
            String password = kbd.next();
            // ENTER
            // username: 423
            // password: SOEN
            isLoggedIn = auth.login(username, password);
            if (isLoggedIn) {
                break;
            }
            System.out.println("Sorry, try again.");
            tryCount++;
        }
        if (isLoggedIn) {
            System.out.println("You are logged in!!");
        } else {
            System.out.println(maxTries + " incorrect password attempts");
        }
    }

}
