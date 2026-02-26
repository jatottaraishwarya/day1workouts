public class CheckPrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i * i <= n; i++) { // check divisors up to sqrt(n)
            if (n % i == 0) {
                return false; // divisible by i, not prime
            }
        }
        return true; // no divisors found, number is prime
    }

    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}