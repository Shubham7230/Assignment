import java.util.ArrayList;

public class NumberingCheck {
    public static void main(String[] args) {
        int number = 28;
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number, factors));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }

    public static int[] findFactors(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) list.add(i);
        }
        int[] factors = new int[list.size()];
        for (int i = 0; i < list.size(); i++) factors[i] = list.get(i);
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += factorial(d);
        }
        return sum == number;
    }

    public static int[] storeDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
