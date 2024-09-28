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
 * Question 27: https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int num : nums) {
            if (num != val) {
                nums[idx++] = num;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(
                new int[] { 3, 2, 2, 3 }, 3));
        System.out.println(new RemoveElement().removeElement(
                new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }
}
