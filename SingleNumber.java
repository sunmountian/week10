package com.week10;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 136
 */
public class SingleNumber {
    class Solution {
        //一个数和 0 做异或运算等于本身：a⊕0 = a
        //一个数和其本身做异或运算等于 0：a⊕a = 0
        //异或运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
        //故而在以上的基础条件上，将所有数字按照顺序做异或运算，最后剩下的结果即为唯一的数字
        //时间复杂度：O(n)，空间复杂度：O(1)
        public int singleNumbreverseStringr(int[] nums) {
            int ans = 0;
            for (int num : nums) {
                ans ^= num;
            }
            return ans;
        }
    }
}
