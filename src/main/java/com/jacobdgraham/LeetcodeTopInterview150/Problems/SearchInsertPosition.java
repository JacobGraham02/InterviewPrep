package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class SearchInsertPosition {
    /**
     * Given a sorted array of distinct integers and a target value, finds the index of the target
     * or the index where it would be inserted to maintain the sorted order.
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     * <pre>
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     * </pre>
     *
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: nums = [1,3,5,6], target = 5
     * Initial State:
     *     left = 0, right = 3
     *
     * Step 1:
     *     mid = left + (right - left) / 2
     *        = 0 + (3 - 0) / 2
     *        = 1
     *     nums[mid] = 3; since 3 < 5, move left pointer:
     *     left = mid + 1
     *        = 2
     *     right remains 3
     *
     * Step 2:
     *     mid = left + (right - left) / 2
     *        = 2 + (3 - 2) / 2
     *        = 2
     *     nums[mid] = 5; since 5 == target, return mid:
     *     Output: 2
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: nums = [1,3,5,6], target = 7
     * Initial State:
     *     left = 0, right = 3
     *
     * Step 1:
     *     mid = left + (right - left) / 2
     *        = 0 + (3 - 0) / 2
     *        = 1
     *     nums[mid] = 3; since 3 < 7, move left pointer:
     *     left = mid + 1
     *        = 2
     *     right remains 3
     *
     * Step 2:
     *     mid = left + (right - left) / 2
     *        = 2 + (3 - 2) / 2
     *        = 2
     *     nums[mid] = 5; since 5 < 7, move left pointer:
     *     left = mid + 1
     *        = 3
     *     right remains 3
     *
     * Step 3:
     *     mid = left + (right - left) / 2
     *        = 3 + (3 - 3) / 2
     *        = 3
     *     nums[mid] = 6; since 6 < 7, move left pointer:
     *     left = mid + 1
     *        = 4
     *
     * Since left > right, return left as the insertion position:
     * Output: 4
     * </pre>
     *
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li>1 <= nums.length <= 10^4</li>
     *   <li>-10^4 <= nums[i] <= 10^4</li>
     *   <li>nums contains distinct values sorted in ascending order.</li>
     *   <li>-10^4 <= target <= 10^4</li>
     * </ul>
     *
     * @param nums a sorted array of distinct integers
     * @param target the target integer to find
     * @return the index of the target or its insertion position
     * @see <a href="https://leetcode.com/problems/search-insert-position/" title="A link to the leetcode problem 'Search Insert Position'">Leetcode</a>
     */
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            int middlePointer = (leftPointer + (rightPointer - leftPointer) / 2);

            if (nums[middlePointer] == target) {
                return middlePointer;
            } else if (nums[middlePointer] < target) {
                leftPointer = middlePointer + 1;
            } else {
                rightPointer = middlePointer - 1;
            }
        }

        return leftPointer;
    }
}