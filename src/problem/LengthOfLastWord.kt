package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/length-of-last-word/
 */

fun lengthOfLastWord(s: String): Int {
    var length = 0
    for(c in s.length-1 downTo 0) {
        if(s[c] == ' ') {
            if(length > 0) {
                return length

            }
        }
        else {
            length++
        }
    }
    return length
}