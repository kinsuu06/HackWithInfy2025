import java.util.*;

public class Activity_Selection_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of activities
        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        // Create a 2D array to store start and end times
        int[][] activities = new int[n][2];
        System.out.println("Enter start and end times of activities:");
        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt(); // start time
            activities[i][1] = sc.nextInt(); // end time
        }

        // Sort activities based on their end times
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);

        // Initialize the count with the first activity selected
        int count = 1;
        int lastEndTime = activities[0][1]; // End time of the last selected activity

        // Iterate through the rest of the activities
        for (int i = 1; i < n; i++) {
            // If the start time of the current activity is after or at the end time of last selected activity
            if (activities[i][0] >= lastEndTime) {
                count++; // Select the activity
                lastEndTime = activities[i][1]; // Update end time
            }
        }

        // Output the maximum number of non-overlapping activities
        System.out.println("Maximum number of non-overlapping activities: " + count);

        
    }
}
