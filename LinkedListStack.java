public class LinkedListStack {
    public Node top;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng.");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng.");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
