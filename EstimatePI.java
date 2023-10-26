// Import necessary classes or libraries
import java.util.Random;
import java.util.Scanner;

public class EstimatePI {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of random points to generate
        System.out.println("Enter the number of random points to generate (N): ");

        // Read the user input and store it in variable N
        int N = sc.nextInt();

        // Create a variable to keep track of the number of points that fall inside the quarter circle
        int insideCircle = 0;

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Iterate N times to generate N random points
        for (int i = 0; i < N; i++) {
            // Generate random x and y coordinates for each point
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Check if the point falls inside the quarter circle using the equation x^2 + y^2 <= 1
            if (x * x + y * y <= 1) {
                // Increment the counter if the point falls inside the quarter circle
                insideCircle++;
            }
        }

        // Calculate the estimate of PI using the ratio of points inside the quarter circle to total points, and multiply by 4
        double piEstimate = 4.0 * insideCircle / N;

        // Calculate the absolute error by finding the absolute difference between the estimated value and the actual value of PI
        double absoluteError = Math.abs(piEstimate - Math.PI);

        // Output the estimated value of PI and the absolute error to the console
        System.out.println("PI is " + piEstimate);
        System.out.println("Absolute error: " + absoluteError);

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}