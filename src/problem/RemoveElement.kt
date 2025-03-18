package problem

fun removeElement(nums: IntArray, `val`: Int): Int {
    var j = 0
    for(i in nums) {
        if(i != `val`) {
            nums[j++] = i
        }
    }
    return j
}