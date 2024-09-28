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

/**
 * Question 26:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDupeFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }

    /**
     * Driver method.
     * 
     * @param args System arguments
     */
    public static void main(String[] args) {
        System.out.println(new RemoveDupeFromSortedArray().removeDuplicates(
                new int[] { 1, 1, 2 }));
        System.out.println(new RemoveDupeFromSortedArray().removeDuplicates(
                new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }
}
