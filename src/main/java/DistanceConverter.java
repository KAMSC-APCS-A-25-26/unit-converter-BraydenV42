import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices


        boolean running = true;
        double miles;
        double kilometers;
        Scanner sc = new Scanner(System.in);

        while (running) {
            int choice;
            System.out.println("\nChoose conversion direction");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice: (1, 2, or 3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter distance in Miles: ");
                    miles = sc.nextDouble();
                    System.out.println();
                    System.out.println("Coversion Results: ");
                    kilometers = miles * 1.60935;
                    System.out.println("Miles: " + miles);
                    System.out.println("Kilometers: " + kilometers);
                    break;
                case 2:
                    System.out.print("Enter distance in Kilometers: ");
                    kilometers = sc.nextDouble();
                    System.out.println("Coversion Results: ");
                    miles = kilometers / 1.60935;
                    System.out.println("Kilometers: " + kilometers);
                    System.out.println("Miles: " + miles);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}
