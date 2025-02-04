package ar.com.old.nodes;

public class SingleLinkedList {
    public Node head;
    public int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.size++;
            return;
        }
        Node current = this.head;
        this.head = new Node(value);
        this.head.next = current;
        this.size++;
    }
}
