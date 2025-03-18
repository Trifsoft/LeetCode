package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

fun removeDuplicates(nums: IntArray): Int {
    var j = 1
    for(i in 1..<nums.size) {
        if(nums[i] != nums[j-1] ) {
            nums[j++] = nums[i]
        }
    }
    return j
}