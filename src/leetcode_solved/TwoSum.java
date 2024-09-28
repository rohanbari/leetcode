/*
 Copyright 2024 Rohan Bari <rohanbari@outlook.com>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package leetcode_solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Question 1: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // Finding the complement in O(1)
                return new int[] { i, map.get(complement) };
            }

            // If not found, then simply map the element to its index
            map.put(nums[i], i);
        }

        // If not found
        return new int[] {};
    }

    /**
     * Driver method.
     * 
     * @param args System arguments
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] { 3, 3 }, 6)));
    }
}
