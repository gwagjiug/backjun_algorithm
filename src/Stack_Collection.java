import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println("top element is : " + stack.peek());


        stack.pop();
        stack.pop();

        System.out.println("stack size : " + stack.size());

        if (stack.empty()){
            System.out.println("스택이 비어있습니다");
        }
        else {
            System.out.println("스택이 비어있지 않습니다.");
        }

    }
}
