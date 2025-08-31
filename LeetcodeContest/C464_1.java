//Contest 464_P1 : GCC OF ODD AND EVEN SUMS

// You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

// sumOdd: the sum of the first n odd numbers.

// sumEven: the sum of the first n even numbers.

// Return the GCD of sumOdd and sumEven.

// Example 1:

// Input: n = 4

// Output: 4

// Explanation:

// Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
// Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
// Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

// Example 2:

// Input: n = 5

// Output: 5

// Explanation:

// Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
// Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30
// Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.

// Constraints:

// 1 <= n <= 10​​​​​​​00

public class C464_1 {

    public int gcdFind(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {
            sumOdd = sumOdd + (2 * i + 1);
            sumEven = sumEven + (2 * i + 2);
        }
        return gcdFind(sumOdd, sumEven);

    }
}
