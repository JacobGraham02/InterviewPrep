package com.jacobdgraham.DailyCodingProblem;

public class UnbiasedCoinToss {
    /**
     * Simulates an unbiased coin toss using a biased coin toss function.
     *
     * <p>This method uses a hypothetical <code>tossBiased()</code> function, which returns
     * either 0 or 1 with an unknown probability that is not 50-50. By calling <code>tossBiased()</code>
     * twice and checking for pairs of different outcomes, we can simulate an unbiased coin toss.</p>
     *
     * <p>The logic works as follows:</p>
     * <ul>
     *   <li>If the two tosses yield 0 and 1 in either order (01 or 10), we return 0 or 1 respectively.</li>
     *   <li>If the two tosses yield the same result (00 or 11), we discard the result and repeat the process.</li>
     * </ul>
     *
     * <p>This approach works because the probability of obtaining 01 is equal to that of obtaining 10,
     * making the outcomes unbiased regardless of the original bias of <code>tossBiased()</code>.</p>
     *
     * @return an unbiased result of 0 or 1, simulating a fair coin toss
     */
    public int tossUnbiased() {
        /*
        If toss1 == toss2, we loop again to disregard the result
         */
        while (true) {
            int toss1 = tossBiased();
            int toss2 = tossBiased();

            if (toss1 == 0 && toss2 == 1) {
                return 0;
            }
            if (toss1 == 1 && toss2 == 0) {
                return 1;
            }
        }
    }

    /**
     * Function that returns 0 or 1 with a bias.
     * <p>In a real scenario, this function would be provided externally,
     * with an unknown probability of returning 0 or 1.</p>
     *
     * @return 0 or 1 with an unknown bias
     */
    private int tossBiased() {
        /*
        I chose 0.7 because that would be a bias that allows for a 69% chance to return 1, and 31% chance to return a 0
         */
        if (Math.random() < 0.7) {
            return 1;
        } else {
            return 0;
        }
    }
}
