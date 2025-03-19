package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */

fun strStr(haystack: String, needle: String): Int {
    for(i in 0..haystack.length-needle.length) {
        if((i..<i+needle.length).all { haystack[it] == needle[it-i]}) {
            return i
        }
    }
    return -1
}