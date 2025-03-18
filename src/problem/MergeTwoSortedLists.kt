package problem

import model.ListNode

/**
 * Link to the problem:
 * https://leetcode.com/problems/merge-two-sorted-lists
 */

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) {
        return list2
    }
    else if (list2 == null) {
        return list1
    }
    else if(list1.`val` < list2.`val`) {
        val res = ListNode(list1.`val`)
        res.next = mergeTwoLists(list1.next, list2)
        return res
    }
    else {
        val res = ListNode(list2.`val`)
        res.next = mergeTwoLists(list1, list2.next)
        return res
    }
}
