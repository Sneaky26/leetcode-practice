import java.util.InputMismatchException;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        int choice;
                        
        while (true) {
            System.out.println("Multiplication Calculator");
            System.out.println();
            System.out.println("Enter number [ 1 ] or [ 0 ] to proceed.");
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("[ 1 ] Multiplication Calculator");
            System.out.println("[ 0 ] Exit The Program");
            System.out.println();
            System.out.print("Enter number of desired choice: ");
            try {
                choice = calculator.nextInt();
                if (choice == 1) {
                    performMultiplication(calculator);
                } else if (choice == 0) {
                    System.out.println("-------------------------------------------\n");
                    System.out.println("Exiting the program.");
                    System.out.println("\n-------------------------------------------\n");
                    break;
                } else {
                    System.out.println("Invalid option. Please enter 1 or 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number (1 or 0).");
                calculator.nextLine();
            }
        }

        calculator.close();
    }

    public static void performMultiplication(Scanner calculator) {
        float multiplicand, multiplier, product;
        int i;
        
        while (true) {
        product = 0;    
        System.out.println("Multiplication");
        System.out.println("-----------------");

        
        while (true) {
            System.out.print("Multiplicand: ");
            try {
                multiplicand = calculator.nextFloat();
                if (multiplicand < 0) {
                    System.out.println("------------------------------------\n");
                    System.out.println("Negative numbers are not accepted.");
                    System.out.println("Please enter a non-negative number.\n");
                    System.out.println("------------------------------------\n");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("------------------------------------\n");
                System.out.println("Invalid input. Please enter a number.\n");
                System.out.println("------------------------------------\n");
                calculator.nextLine(); 
            }
        }

        
        while (true) {
            System.out.print("Multiplier: ");
            try {
                multiplier = calculator.nextFloat();
                if (multiplier < 0) {
                    System.out.println("------------------------------------\n");
                    System.out.println("Negative numbers are not accepted.");
                    System.out.println("Please enter a non-negative number.\n");
                    System.out.println("------------------------------------\n");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("------------------------------------\n");
                System.out.println("Invalid input. Please enter a number.");
                System.out.println("------------------------------------\n");
                calculator.nextLine(); 
            }
        }

        
        for (i = 0; i < multiplier; i++) {
            product += multiplicand;
        }

        System.out.println("-------------------------------------------\n");
        System.out.println("Product: " + product);
        System.out.println("-------------------------------------------\n");

        boolean validResponse = false;
        while (!validResponse) {
        
        System.out.println("If you want you to multiply again Type 'Yes' ");
        System.out.println("If you want to go to the Main Menu Type 'No' ");
        System.out.println("-------------------------------------------\n");
        System.err.print("Enter Descision Here ( Yes / No ): ");
        String continueChoice = calculator.next().toLowerCase();
        System.out.println("\n-------------------------------------------\n");
            

            if (continueChoice.equals("yes")) {
                validResponse = true; 
            } else if (continueChoice.equals("no")) {
                System.out.println("Returning to the Main Menu.\n");
                return; 
            } else {
                System.out.println("Invalid input. Please type 'Yes' or 'No'.\n");
          }
        }         
     }    
   }
}