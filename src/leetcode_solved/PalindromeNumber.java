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
 * Question 2: https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // Negative integers are not palindrome here and multiplier of 10s
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        // To store the reverse
        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return (x == rev || x == rev / 10);
    }

    /**
     * Driver method.
     * 
     * @param args System arguments
     */
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
        System.out.println(new PalindromeNumber().isPalindrome(-121));
        System.out.println(new PalindromeNumber().isPalindrome(10));
    }
}
