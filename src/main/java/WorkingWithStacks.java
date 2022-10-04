import java.util.Stack;

public class WorkingWithStacks {

    //LIFO LAST IN FIRST OUT

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //to find out whats at the top of the stack
        System.out.println(stack.peek());
        System.out.println(stack.size());

        //pop removes the last integer that was IN
        System.out.println(stack.pop());

        System.out.println(stack.size());


    }


}
