import java.util.LinkedList;

public class DemoLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);

        System.out.println("Phần tử trên đỉnh: " + linkedListStack.peek());

        System.out.println("Lấy ra: " + linkedListStack.pop());
        System.out.println("Phần tử trên đỉnh sau khi pop: " + linkedListStack.peek());
    }
}
