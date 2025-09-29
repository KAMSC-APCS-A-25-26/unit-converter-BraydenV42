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
            System.out.println("------------Distance Converter-------------");
            System.out.println("1. Miles to Kilometers");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    miles = sc.nextDouble();
                    kilometers = miles * 1.60935;
                case 2:
                    kilometers = sc.nextDouble();
                    miles = kilometers / 1.60935;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}
