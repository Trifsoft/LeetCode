/**
 * Link to the problem:
 * https://leetcode.com/problems/roman-to-integer/
 */

fun romanCharacterToInt(c: Char) = when(c) {
    'I' -> 1
    'V' -> 5
    'X' -> 10
    'L' -> 50
    'C' -> 100
    'D' -> 500
    'M' -> 1000
    else -> 0
}

fun romanToInt(s: String): Int {
    var result = romanCharacterToInt(s.last())
    var lastChar = result
    for(i in s.length-2 downTo 0) {
        val tempChar = romanCharacterToInt(s[i])
        if(tempChar < lastChar) {
            result -= tempChar
        }
        else {
            result += tempChar
        }
        lastChar = tempChar
    }
    return result
}

fun main() {
    val s = "I"
    print(romanToInt(s))
}