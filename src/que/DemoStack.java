package que;

import java.util.Stack;

public class DemoStack {
    static void main() {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
