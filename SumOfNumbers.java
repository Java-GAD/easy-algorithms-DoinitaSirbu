public class Main {
    public static void main(String[] args) {

        int n = 5;
        int result = SumOfNumbers.calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + result);

    }
    }
public class SumOfNumbers {
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

}
