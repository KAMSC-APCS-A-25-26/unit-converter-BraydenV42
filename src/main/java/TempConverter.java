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
        double Celsius;
        double Fahrenheit;
        Scanner sc = new Scanner(System.in);

        while (running) {
            int choice;
            System.out.println("------------Temperature Converter-------------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Celsius = sc.nextDouble();
                    Fahrenheit = Celsius * 9/5 + 32;
                    System.out.println(Fahrenheit);
                    break;
                case 2:
                    Fahrenheit = sc.nextDouble();
                    Celsius = (Fahrenheit - 32) * 5/9;
                    System.out.println(Celsius);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}