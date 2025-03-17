import java.util.Stack

/**
 * Link to the problem:
 * https://leetcode.com/problems/valid-parentheses
 */

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        when(it) {
            '(', '[', '{' -> stack.push(it)
            ')' -> if(stack.empty() || stack.peek() != '(')
                return false
            else stack.pop()
            ']' -> if(stack.empty() || stack.peek() != '[')
                return false
            else stack.pop()
            '}' -> if(stack.empty() || stack.peek() != '{')
                return false
            else stack.pop()
        }
    }
    return stack.isEmpty()
}