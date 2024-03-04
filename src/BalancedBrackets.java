import java.util.LinkedList;

public class BalancedBrackets {
    static String isBalanced(String s) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == '}' && top != '{') ||
                        (bracket == ']' && top != '[')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String[] inputs = {"{[()]}",
                "{[(])}",
                "{{[[(())]]}}"};

        for (String input : inputs) {
            System.out.println(isBalanced(input));
        }
    }
}
