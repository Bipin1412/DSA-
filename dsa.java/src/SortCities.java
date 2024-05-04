

import java.util.Arrays;
import java.util.Scanner;

    public class SortCities {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of cities (n): ");
            int n = scanner.nextInt();

            // Create an array to store the names of cities
            String[] cities = new String[n];

            // Input city names
            System.out.println("Enter the names of cities:");

            for (int i = 0; i < n; i++) {
                System.out.print("City " + (i + 1) + ": ");
                cities[i] = scanner.next();
            }

            // Sort the array in ascending order
            Arrays.sort(cities);

            // Display the sorted city names
            System.out.println("Cities in ascending order:");

            for (String city : cities) {
                System.out.println(city);
            }
        }
    }


