package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/add-two-numbers/
 */

import model.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null) return l2
    else if(l2 == null) return l1
    else {
        var increase = 0
        val result = ListNode(0)
        var tmpResult = result
        var tmpL1 = l1
        var tmpL2 = l2
        while(tmpL1?.next != null || tmpL2?.next != null) {
            val val1 = tmpL1?.`val` ?: 0
            val val2 = tmpL2?.`val` ?: 0
            if(val1 + val2 + increase < 10) {
                tmpResult.`val` = val1 + val2 + increase
                increase = 0
            }
            else {
                tmpResult.`val` = val1 + val2 + increase - 10
                increase = 1
            }
            tmpResult.next = ListNode(0)
            tmpResult = tmpResult.next!!
            tmpL1 = tmpL1?.next
            tmpL2 = tmpL2?.next
        }
        val val1 = tmpL1?.`val` ?: 0
        val val2 = tmpL2?.`val` ?: 0
        if(val1 + val2 + increase < 10) {
            tmpResult.`val` = val1 + val2 + increase
        }
        else {
            tmpResult.`val` = val1 + val2 + increase - 10
            tmpResult.next = ListNode(1)
        }
        return result
    }
}

fun main() {

}