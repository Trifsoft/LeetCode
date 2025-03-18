package problem

/**
 * Link to the problem:
 * https://leetcode.com/problems/longest-common-prefix/
 */

fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.isEmpty()) return ""
    for(i in 0..<200) {
        if(!strs.all { str -> str.length > i && str[i] == strs[0][i]}) {
            return strs[0].substring(0..<i)
        }
    }
    return ""
}

fun main(){
    print(longestCommonPrefix(arrayOf(
        "flower", "flow", "flight"
    )))
}