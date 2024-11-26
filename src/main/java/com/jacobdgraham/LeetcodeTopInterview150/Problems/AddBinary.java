package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class AddBinary {
    /**
     * Adds two binary strings and returns their sum as a binary string.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: a = "11", b = "1"
     * Output: "100"
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= a.length, b.length <= 10⁴</li>
     *   <li>a and b consist only of '0' or '1' characters.</li>
     *   <li>Each string does not contain leading zeros except for the zero itself.</li>
     * </ul>
     *
     * <p>Time complexity: <strong>O(max(m,n)),</strong> where m and n are the lengths of a and b. Each digit is processed once.</p>
     * <p>Space complexity: <strong>O(max(m,n)),</strong> for the resulting string.</p>
     *
     *
     * @param a the first binary string
     * @param b the second binary string
     * @return the sum of the two binary strings as a binary string
     * @see <a href="https://leetcode.com/problems/add-binary/description/" title="A link to the leetcode problem 'Add Binary'">Leetcode</a>
     */
    public String addBinary(String a, String b) {
        /*
        Binary addition, subtraction, division, multiplication is done going from the right to left.
        (i.e., 1001 + 101 you start at the right-most digit and work towards the left-most digit.
        We use the modulus operator to get a binary digit (the operator only returns 0 or 1), and
        we use the division operator to update the carry digit value.
        We append the carry value to the end result if it is not zero
         */
        StringBuilder addedBinaryResults = new StringBuilder();

        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        int aDigit = 0;
        int bDigit = 0;
        int carryDigit = 0;

        while (aPointer >= 0 || bPointer >= 0 || carryDigit > 0) {
            if (aPointer >= 0) {
                aDigit = a.charAt(aPointer--) - '0';
            } else {
                aDigit = 0;
            }

            if (bPointer >= 0) {
                bDigit = b.charAt(bPointer--) - '0';
            } else {
                bDigit = 0;
            }

            int sum = aDigit + bDigit + carryDigit;
            int binarySum = sum % 2;
            addedBinaryResults.append(binarySum);
            /*
            The maximum sum we can have is 3. So, by dividing it by 2 and assigning to the carry digit, we get a valid binary digit of 1.
             */
            carryDigit = sum / 2;
        }

        return addedBinaryResults.reverse().toString();
    }
}
