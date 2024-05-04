import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    // Parameterized constructor
    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = avg(total_runs, no_of_innings, no_of_times_notout);
    }

    // Static method to calculate batting average
    static double avg(int total_runs, int no_of_innings, int no_of_times_notout) {
        if (no_of_innings == 0) {
            return 0.0;
        }
        return ((double) total_runs) / (no_of_innings - no_of_times_notout);
    }

    // Static method to sort array based on average
    static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (player1, player2) -> Double.compare(player2.bat_avg, player1.bat_avg));
    }

    // Method to display player details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Batting Average: " + bat_avg);
        // Add other details as needed
        System.out.println();
    }
}


public class CricketPlayerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players (n): ");
        int n = scanner.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

    }
    }
