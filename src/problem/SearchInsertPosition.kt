package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/search-insert-position
 */

fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size
    var s: Int
    while(l < r) {
        s = (l+r)/2
        if(nums[s] < target) {
            l = s+1
        }
        else {
            r = s
        }
    }
    return l
}

fun main() {
    print(searchInsert(intArrayOf(1,3,5,6), 5))
}