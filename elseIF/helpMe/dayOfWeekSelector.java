package helpMe;

import java.util.Scanner;
    
    public class dayOfWeekSelector {
    public static void main(String[] args) {
        Scanner inputSelector = new Scanner(System.in);
        String continueChoice;

        /*  =========================
            -> Created by Group 1 <-
              
              John Christian Bansil
              Justine Dimla
              Aedrian Jerome Gabriel
            ==========================  */
    do {    
        int day; 
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("     DAYS OF THE WEEK SELECTOR\n");
        System.out.println("Select a number between [ 0 ] - [ 7 ] to choose your desired day of the week \n");
        System.out.println("Each day has a unique scheduled activities assigned for the day. \n");
        System.out.println("      The Days of the Week:" + "\n");
        System.out.println("       [ 1 ] - Monday");
        System.out.println("       [ 2 ] - Tuesday");
        System.out.println("       [ 3 ] - Wednesday");
        System.out.println("       [ 4 ] - Thursday");
        System.out.println("       [ 5 ] - Friday");
        System.out.println("       [ 6 ] - Saturday");
        System.out.println("       [ 7 ] - Sunday");
        System.out.println("       [ 0 ] - Exit the program");
        System.out.println("       -------------------------");
        System.out.print("       Enter number here --> : ");

        day = inputSelector.nextInt();
        System.out.println();

        switch(day) {
            case 1:
            System.out.println("       -----------------------");
            System.out.println("       You have chosen MONDAY.");
            System.out.println("       -----------------------");
            System.out.print("Here are the list of activities for Monday:\n" + 
                                "07:00 AM - 10:00 AM  -->  Computer Programming\n" + 
                                "10:00 AM - 01:00 PM  -->  Introduction to Computing\n" + 
                                "04:00 PM - 07:00 PM  -->  Mathematics in Modern World");
            System.out.println("\n-------------------------------------------------");
                break;                

            case 2:   
            System.out.println("       -----------------------");
            System.out.println("       You have chosen TUESDAY.");
            System.out.println("       -----------------------");
            System.out.print("Here are the list of activities for Tuesday:\n" + 
                                "07:00 AM - 09:00 AM  -->  Computer Programming \n" + 
                                "09:00 AM - 11:00 AM  -->  Introduction to Computing\n" + 
                                "02:00 PM - 05:00 PM  -->  ROTC/LTS/CTWS");
            System.out.println("\n-------------------------------------------------");
                break;
                
            case 3:
            System.out.println("       -------------------------");
            System.out.println("       You have chosen WEDNESDAY.");
            System.out.println("       -------------------------");
            System.out.print("Here are the list of activities for Wednesday:\n" + 
                                "07:00 AM - 09:00 AM  -->  Physical Education\n" + 
                                "10:00 AM - 11:30 AM  -->  Contemporary World\n" + 
                                "11:30 AM - 01:00 PM  -->  Purposive Communication\n" + 
                                "01:00 PM - 02:30 PM  -->  Philippine History");
            System.out.println("\n-------------------------------------------------");
                break;
            
            case 4:
            System.out.println("       ------------------------");
            System.out.println("       You have chosen THURSDAY.");
            System.out.println("       ------------------------");
            System.out.print("Here are the list of activities for Thursday:\n" + 
                                "07:00 AM - 08:30 AM  -->  Contemporary World\n" + 
                                "08:30 AM - 10:00 AM  -->  Purposive Communication\n" + 
                                "10:00 AM - 01:00 PM  -->  Araling Pilipino");
            System.out.println("\n-------------------------------------------------");
                break;
            
            case 5:
            System.out.println("       ----------------------");
            System.out.println("       You have chosen FRIDAY.:");
            System.out.println("       ----------------------");
            System.out.print("Here are the list of activities for Friday\n" + 
                                "01:00 PM - 02:30 PM  -->  Philippine History");
            System.out.println("\n-------------------------------------------------");
                break;
            
            case 6:
            System.out.println("       ------------------------");
            System.out.println("       You have chosen SATURDAY.");
            System.out.println("       ------------------------");
            System.out.print("Here are the list of activities for Saturday:\n" + 
                                "09:00 AM - 11:00 AM  -->  Cleaning the house\n" + 
                                "01:00 PM - 03:00 PM  -->  Going to the Gym\n" + 
                                "05:00 PM - 07:00 PM  -->  Playing Computer Games");
            System.out.println("\n-------------------------------------------------");
                
                break;
            
            case 7:
            System.out.println("       ----------------------");
            System.out.println("       You have chosen SUNDAY.");
            System.out.println("       ----------------------");
            System.out.print("Here are the list of activities for Sunday:\n" + 
                                "07:00 AM - 09:00 AM  -->  Going to Church\n" + 
                                "12:00 PM - 01:00 PM  -->  Eating at a Restaurant\n" + 
                                "03:00 PM - 05:00 PM  -->  Watching a Movie");
            System.out.println("\n-------------------------------------------------");

                break;
                
            case 0:
            System.out.println("    - You are now leaving the program. -" + "\n");
                System.exit(day);
                break;
            
            default:
            System.out.println("\nInvalid choice. Please select a number between [ 0 ] <--> [ 7 ].");
                
                break;    
        }
        
        System.out.println();
        
     do {   // loop for invalid input in Yes or No
        System.out.print("\nDo you want to select another day? Type (Yes or No): ");
        continueChoice = inputSelector.next();

    if (!continueChoice.equalsIgnoreCase("yes") && !continueChoice.equalsIgnoreCase("no")) {
            System.out.println(" ");
            System.out.println("Invalid input. Please type 'Yes' or 'No'.");

        }
        
    } while (!continueChoice.equalsIgnoreCase("yes") && !continueChoice.equalsIgnoreCase("no"));


        System.out.println();
        
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("Program ended. Thank you for using the Days of the Week Selector!");
            inputSelector.close();
    }
}