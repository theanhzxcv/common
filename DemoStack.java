import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        System.out.println("Stack hiện tại: " + newStack);
        System.out.println("Phần tử ở đỉnh: " + newStack.peek());
        System.out.println("Lấy ra: " + newStack.pop());
        System.out.println("Stack sau khi lấy: " + newStack);
        boolean isEmpty = newStack.isEmpty();
        if (isEmpty) {
            System.out.println("Stack rỗng.");
        } else {
            System.out.println("Stack không rỗng.");
        }
    }
}
