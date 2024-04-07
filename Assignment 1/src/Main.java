public class Main {

    // Problem 1
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Problem 2
    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Problem 3
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Problem 4
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Problem 5
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Problem 6
    public static double power(int a, int n) {
        return Math.pow(a, n);
    }

    // Problem 7
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }

    // Problem 8
    public static boolean isAllDigits(String s) {
        return s.matches("[0-9]+");
    }

    // Problem 9
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Problem 10
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 1, 32, 3, 45};
        System.out.println("Minimum: " + findMinimum(array));
        System.out.println("Average: " + calculateAverage(array));
        System.out.println("7 is prime: " + isPrime(7));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("5th Fibonacci number: " + fibonacci(5));
        System.out.println("2^10: " + power(2, 10));
        System.out.println("Permutations of 'IOX':");
        permute("IOX", "");
        System.out.println("123456 contains only digits: " + isAllDigits("123456"));
        System.out.println("Binomial Coefficient C(7, 3): " + binomialCoefficient(7, 3));
        System.out.println("GCD of 32 and 48: " + gcd(32, 48));
    }
}