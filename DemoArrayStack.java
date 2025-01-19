public class DemoArrayStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        System.out.println("Phần tử trên đỉnh: " + arrayStack.peek());

        System.out.println("Lấy ra: " + arrayStack.pop());
        System.out.println("Phần tử trên đỉnh sau khi pop: " + arrayStack.peek());
    }
}
