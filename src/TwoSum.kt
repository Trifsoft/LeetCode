/**
 * Link to the problem:
 * https://leetcode.com/problems/two-sum/
 */

fun twoSum(nums: IntArray, target: Int): IntArray {
    val pairList =
        nums.mapIndexed{ index, i -> Pair(i, index) }
            .sortedBy { it.first }
    var i = 0
    var j = pairList.size - 1
    while(i < j) {
        if(pairList[i].first + pairList[j].first > target) {
            j--
        }
        else if(pairList[i].first + pairList[j].first < target) {
            i++
        }
        else {
            return intArrayOf(pairList[i].second, pairList[j].second)
        }
    }
    return intArrayOf()
}