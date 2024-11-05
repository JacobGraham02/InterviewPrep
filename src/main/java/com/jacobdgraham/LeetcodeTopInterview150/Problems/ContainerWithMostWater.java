package com.jacobdgraham.LeetcodeTopInterview150.Problems;

public class ContainerWithMostWater {
    /**
     * Finds the maximum area of water a container can hold given an array of heights.
     *
     * <p>Each element in the array <code>height</code> represents the height of a vertical line drawn at
     * that index. The width between each pair of lines is the difference in their indices. The container's
     * area is defined by the distance between two lines and the shorter line's height. The goal is to find
     * the two lines that together with the x-axis can form a container holding the maximum amount of water.</p>
     *
     * <p><strong>Example 1:</strong></p>
     * <pre>
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The lines represented by heights [1,8,6,2,5,4,8,3,7] can form a container with a maximum
     * area of 49 units, formed by the lines at indices 1 and 8 (with heights 8 and 7 respectively).
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     * <pre>
     * Input: height = [1,1]
     * Output: 1
     * Explanation: The container formed by both lines at indices 0 and 1 has an area of 1 unit.
     * </pre>
     *
     * <p><strong>Constraints:</strong></p>
     * <ul>
     *   <li><code>n == height.length</code></li>
     *   <li><code>2 <= n <= 10<sup>5</sup></code></li>
     *   <li><code>0 <= height[i] <= 10<sup>4</sup></code></li>
     * </ul>
     *
     * @param height an integer array where each element represents the height of a vertical line
     * @return the maximum area of water the container can hold
     */
    public int maxArea(int[] height) {
        /*
        First, we will create the local variables needed for this algorithm: the left-hand side pointer, the right-hand side pointer, and the
        maximum area of the container. The left- and right-hand side pointers will be used together to determine a container that holds
        the maximum amount of water. As such, we will use a 2-pointer approach to solve this problem.
         */
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maximumArea = 0;

        while (leftPointer < rightPointer) {
            /*
            We are determining the area of a rectangle. Therefore, we need the weight and height of the container.
            Because the top of the water, the 2 columns that represent the walls of the container, and the graph x-axis itself
            are all straight lines, we can prove the shape is a rectangle.
             */
            int widthOfContainer = rightPointer - leftPointer;
            int heightOfContainer = Math.min(height[leftPointer], height[rightPointer]);
            int areaOfContainer = widthOfContainer * heightOfContainer;

            maximumArea = Math.max(maximumArea, areaOfContainer);

            /*
            We will move the pointer associated with the shortest of the 2 container columns. If the left pointer is shorter, increment it
            If the right pointer is shorter, decrement it
             */
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maximumArea;
    }
}
