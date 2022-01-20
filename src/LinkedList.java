class Node {
    public int value;
    public Node next = null;

    public Node(int value) {
        this.value = value;
    }
}

public class LinkedList {
    public Node head = null;
    public Node tail = null;
    public int size = 0;
    public int minValue;
    public int maxValue;

    public void add(Node newNode) {
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
            minValue = newNode.value;
            maxValue = newNode.value;
        } else {
            newNode.next = head;
            head = newNode;
            if(newNode.value < minValue) {
                minValue = newNode.value;
            }
            if(newNode.value > maxValue) {
                maxValue = newNode.value;
            }
        }
        size++;
    }

    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add(new Node(10));
        test.add(new Node(5));
        test.add(new Node(140));
        test.add(new Node(1));
        test.add(new Node(8));

        System.out.println(test.size);
        System.out.println(test.head.value);
        System.out.println(test.tail.value);
        System.out.println(test.minValue);
        System.out.println(test.maxValue);
    }
}
