public class CheckerNumber {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        int[][] freq = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] pair : freq) {
            System.out.println("Digit: " + pair[0] + ", Frequency: " + pair[1]);
        }
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        int[] digits = storeDigits(number);
        for (int d : digits) freq[d]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }
}
