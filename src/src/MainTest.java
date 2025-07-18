package src;

import java.util.Scanner;

public class MainTest
{
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Status:");
        System.out.println("1. Login");
        System.out.println("2. Search");
        System.out.println("3. Navigation");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                login obj = new ExternalClass(); // calling external class of login
                obj.LoginFunction(By);
                obj.LoginFunction1();
                obj.LoginFunction2();
                obj.LoginFunction3();
                obj.LoginFunction4();
                break; // Exit the switch statement
            case 2: // If choice is 2
                search obj1 = new ExternalClass1();// calling external class of search
                obj1.SearchFunction();
                obj1.SearchFunction1();
                obj1.SearchFunction2();
                obj1.SearchFunction3();
                break;
            case 3: // If choice is 2
                navigation obj2 = new ExternalClass2();// calling external class of navigation
                obj2.NavigationFunction();
                obj2.NavigationFunction1();
                obj2.NavigationFunction2();
                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 , 2 or 3");
                break;
        }

        input.close(); // Close the scanner

    }

    public static class ExternalClass extends login {
    }
    public static class ExternalClass1 extends search{
    }
    public static class ExternalClass2 extends navigation {
    }
}
