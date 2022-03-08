/**
 * Create a for statement using a range of numbers from 1 to 1000 (inclusive)
 * Sum all the numbers that can be divided by both 3 and 5
 * If number is divisible by both 3 and 5, print the number
 * Exit loop when total numbers = 5
 * Print the sum of those 5 numbers
 */
public class SumOfThreeAndFive {
    public static void loopAndSum() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number is: " + i);
                count++;
                sum += i;
            }
            if (count == 5) {
                System.out.println("Sum is: " + sum);
                break;
            }
        }
    }
}