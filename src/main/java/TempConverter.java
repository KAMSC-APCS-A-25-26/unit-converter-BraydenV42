import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        boolean running = true;
        double Fahrenheit;
        double Celsius;
        Scanner sc = new Scanner(System.in);

        while (running) {
            int choice;
            System.out.println("Choose conversion direction");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice: (1, 2, or 3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter distance in Fahrenheit: ");
                    Fahrenheit = sc.nextDouble();
                    System.out.println();
                    System.out.println("Coversion Results: ");
                    Celsius = (Fahrenheit - 32) * 5/9;
                    System.out.println("Fahrenheit: " + Fahrenheit + " degrees");
                    System.out.println("Celsius: " + Celsius + " degrees\n");
                    break;
                case 2:
                    System.out.print("Enter distance in Celsius: ");
                    Celsius = sc.nextDouble();
                    System.out.println();
                    System.out.println("Coversion Results: ");
                    Fahrenheit = Celsius * 9/5 + 32;
                    System.out.println("Celsius: " + Celsius + " degrees");
                    System.out.println("Fahrenheit: " + Fahrenheit + " degrees\n");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}