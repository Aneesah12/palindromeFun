package palindrome;

//Is it a prime number - either 2 or odd
//Is number less than the parameter and contains digit 7
//Is number a palindrome
//print all numbers below a specific number

public class Palindrome {
    public static boolean isPrimeNumber(int n) {
        if (n % 2 != 0 || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAPalindrome(int n) {
        StringBuilder sb = new StringBuilder().append(n);
        String stringOne = sb.toString();
        StringBuilder sbReverse = sb.reverse();
        String stringTwo = sbReverse.toString();
        if(stringOne.equals(stringTwo)) {
            return true;
        } else {
            return false;
        }
    }

    public static int highestPrimePalindromeContainingSeven(int n) {
        int i;
        int max = 0;
        for(i = n-1; i<n; i--) {
            if(String.valueOf(i).contains("7") && isAPalindrome(i) && isPrimeNumber(i) && i>max) {
                max = i;
                System.out.println(max);
                break;
            }
        }
        return max;
    }
}
