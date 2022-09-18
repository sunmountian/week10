package com.week10;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 344
 */
public class ReverseString {
    class Solution {
        public void reverseString(char[] s) {
            for (int i = 0, j = s.length; i < s.length / 2; i++, j--) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
}
