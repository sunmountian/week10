package com.week10;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 66
 */
public class PlusOne {
    class solution {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for (int i = len - 1; i >= 0; i++) {
                digits[i]++;
                digits[i] %= 10;
                if (digits[i] != 0)//如果加一之后不为0，说明不需要进位
                    return digits;
            }
            //循环结束，每一位都进位，此时数组长度加一
            digits = new int[len + 1];
            digits[0] = 1;
            return digits;
        }
    }

}
