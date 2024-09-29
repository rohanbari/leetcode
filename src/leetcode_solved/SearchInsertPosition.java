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
 * Question 35:
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        int mid = 0;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };

        System.out.println(new SearchInsertPosition().searchInsert(arr, 5));
        System.out.println(new SearchInsertPosition().searchInsert(arr, 2));
        System.out.println(new SearchInsertPosition().searchInsert(arr, 7));
    }
}
