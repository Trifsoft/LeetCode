/**
 * Link to the problem:
 * https://leetcode.com/problems/palindrome-number/
 */

fun isPalindrome(x: Int): Boolean {
    var tmp = x
    var new = 0
    while(tmp > 0) {
        new *= 10
        new += tmp%10
        tmp /= 10
    }
    return new == x
}