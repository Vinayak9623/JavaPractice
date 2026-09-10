package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenrateParenthesis {

    public static void main(String args[]){
        List<String> strings = generateParenthesis(3);

        System.out.println(strings);
    }


    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        StringBuilder current = new StringBuilder();

        backtrack(current, 0, 0, n, result);

        return result;
    }

    private static void backtrack(
            StringBuilder current,
            int open,
            int close,
            int n,
            List<String> result) {

        // Base case
        if (open == n && close == n) {
            result.add(current.toString());
            return;
        }

        // Choice 1: Add '('
        if (open < n) {

            current.append('(');

            backtrack(current, open + 1, close, n, result);

            current.deleteCharAt(current.length() - 1);
        }

        // Choice 2: Add ')'
        if (close < open) {

            current.append(')');

            backtrack(current, open, close + 1, n, result);

            current.deleteCharAt(current.length() - 1);
        }
    }
}
