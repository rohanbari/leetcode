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
 * Question 14: https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        for (String str : strs) {
            min = Math.min(min, str.length());
        }

        String common = "";
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return "\"" + common + "\"";
                }
            }

            common += c;
        }

        return "\"\"";
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(
                new String[] { "flower", "flow", "flight" }));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(
                new String[] { "dog", "racecar", "car" }));
    }
}
