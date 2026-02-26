public class MaxUsingMethod{

    // Method to return the largest of two integers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // Alternatively, you could use: return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int largest = max(10, 20); // Call the max method
        System.out.println("The largest number is: " + largest);
    }
}