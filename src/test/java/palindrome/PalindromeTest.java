package palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isNumberAPrimeNumber() {
        assertFalse(Palindrome.isPrimeNumber(20));
        assertTrue(Palindrome.isPrimeNumber(19));
        assertTrue(Palindrome.isPrimeNumber(19999));
        assertFalse(Palindrome.isPrimeNumber(19998));
        assertTrue(Palindrome.isPrimeNumber(2));
    }

    @Test
    public void isNumberAPalindrome() {
        assertFalse(Palindrome.isAPalindrome(2333));
        assertTrue(Palindrome.isAPalindrome(2442));
    }

    @Test
    public void highestPalindromePrimeContainingSevenBelowACertainNumber() {
        assertEquals(373, Palindrome.highestPrimePalindromeContainingSeven(500));
        assertEquals(9779, Palindrome.highestPrimePalindromeContainingSeven(10000));
        assertEquals(575, Palindrome.highestPrimePalindromeContainingSeven(700));
        assertEquals(39793, Palindrome.highestPrimePalindromeContainingSeven(50000));
        assertEquals(99799, Palindrome.highestPrimePalindromeContainingSeven(100000));
        assertEquals(997799, Palindrome.highestPrimePalindromeContainingSeven(1000001));
    }
}
