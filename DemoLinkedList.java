public class DemoLinkedList {
    public static Node head;

    public static void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void addNode(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        DemoLinkedList list = new DemoLinkedList();

        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;

//        printList();

        addNode(4);
        printList();
    }
}
