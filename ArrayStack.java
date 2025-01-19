public class ArrayStack {
    public int[] arrayStack;
    public int capacity;
    public int top;

    public ArrayStack(int size) {
        this.arrayStack = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public void push(int newValue) {
        if (isFull()) {
            System.out.println("Hàng đợi đã đầy.");
        }
        arrayStack[++top] = newValue;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống.");
        }
        return arrayStack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống.");
        }
        return arrayStack[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
