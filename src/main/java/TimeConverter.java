import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        boolean running = true;
        double Minute, Second, Hour;
        Scanner sc = new Scanner(System.in);

        while(running)
        {
            System.out.println("Convert time to total seconds\n");
            System.out.print("Enter Hours: ");
            Hour = sc.nextDouble();
            System.out.print("Enter Minutes: ");
            Minute = sc.nextDouble();
            System.out.print("Enter Seconds: ");
            Second = sc.nextDouble();
            System.out.println("\n");

            System.out.println("Time Conversion: ");
            System.out.println("Input: " + Hour + " hour(s), " + Minute + " minute(s), " + Second + " seconds");
            running = false;
        }
    }
}
