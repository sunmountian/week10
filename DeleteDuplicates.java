package com.week10;

import com.LC206.ListNode;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 83
 */
public class DeleteDuplicates {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur != null && cur.next != null) {
                if (cur.val == cur.next.val)
                    cur = cur.next.next;
                else
                    cur = cur.next;
            }
            return head;
        }
    }
}
