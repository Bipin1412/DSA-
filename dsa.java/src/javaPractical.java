public class javaPractical {

        public static void main(String[] args) {

            if (args.length == 0) {
                System.out.println("Please provide the array elements as command line arguments.");
                return;
            }

            System.out.println("Prime numbers in the array:");

            // Check each command line argument for primality and print if prime
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        // Function to check if a number is prime
        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


