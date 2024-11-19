package com.jacobdgraham.LeetcodeTopInterview150.Problems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @AfterEach
    void tearDown() {
        palindromeNumber = null;
    }

    @Test
    void testPositivePalindrome() {
        int input = 121;
        assertTrue(palindromeNumber.isPalindrome(input),
                "121 is a palindrome and should return true.");
    }

    @Test
    void testNegativeNumber() {
        int input = -121;
        assertFalse(palindromeNumber.isPalindrome(input),
                "-121 is not a palindrome because of the negative sign.");
    }

    @Test
    void testNonPalindrome() {
        int input = 123;
        assertFalse(palindromeNumber.isPalindrome(input),
                "123 is not a palindrome and should return false.");
    }

    @Test
    void testSingleDigitNumber() {
        int input = 5;
        assertTrue(palindromeNumber.isPalindrome(input),
                "Single-digit numbers like 5 are always palindromes.");
    }

    @Test
    void testZero() {
        int input = 0;
        assertTrue(palindromeNumber.isPalindrome(input),
                "0 is a palindrome and should return true.");
    }

    @Test
    void testNumberEndingInZero() {
        int input = 10;
        assertFalse(palindromeNumber.isPalindrome(input),
                "10 ends in 0 and cannot be a palindrome.");
    }

    @Test
    void testLargePalindrome() {
        int input = 123454321;
        assertTrue(palindromeNumber.isPalindrome(input),
                "123454321 is a large palindrome and should return true.");
    }

    @Test
    void testLargeNonPalindrome() {
        int input = 123456789;
        assertFalse(palindromeNumber.isPalindrome(input),
                "123456789 is a large number but not a palindrome.");
    }

    @Test
    void testEvenLengthPalindrome() {
        int input = 1221;
        assertTrue(palindromeNumber.isPalindrome(input),
                "1221 is an even-length palindrome and should return true.");
    }

    @Test
    void testOddLengthPalindrome() {
        int input = 12321;
        assertTrue(palindromeNumber.isPalindrome(input),
                "12321 is an odd-length palindrome and should return true.");
    }
}