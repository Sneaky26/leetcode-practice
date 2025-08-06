import java.util.Scanner;
    
    public class practice {

            public static void main(String[] args) {
                Scanner calculator = new Scanner(System.in);
                System.out.println("Select a shape to calculate the area:");
                System.out.println("Circle");
                System.out.println("Rectangle");
                System.out.println("Triangle");
                System.out.print("\n");
                System.out.print("You have selected : ");

                String choice;
                double radius,area,width,base,height,length;

                choice = calculator.nextLine();
                if (choice.matches("Circle")) {
                    System.out.print("\nNow you have to enter the radius of your circle");
                    System.out.print("\nRadius of the circle: ");
                    radius = calculator.nextDouble();
                    area = 3.14 * radius * radius;
                    System.out.print("\nThe area of the circle is: " + area);

                } else if (choice.matches("Rectangle")) {
                    System.out.print("\nNow you have to enter the length of your rectangle");
                    System.out.print("\nLength of the rectangle: ");
                    length = calculator.nextDouble();
                    System.out.print("\nNow you have to enter width of your rectangle");
                    System.out.print("\nWidth of the rectangle: ");
                    width = calculator.nextDouble();
                    area = length * width;
                    System.out.println("\nThe area of the rectangle is: " + area);

                } else if (choice.matches("Triangle")) {
                    System.out.print("\nNow you have to enter the base of your triangle");
                    System.out.print("\nBase of the circle: ");
                    base = calculator.nextDouble();
                    System.out.print("\nNow you have to enter the height of your triangle");
                    System.out.print("\nHeight of the triangle: ");
                    height = calculator.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("\nThe area of the triangle is: " + area);

                } else {
                    System.out.println("\nInvalid choice. Please select a valid option.");
                }
                
            }
        }