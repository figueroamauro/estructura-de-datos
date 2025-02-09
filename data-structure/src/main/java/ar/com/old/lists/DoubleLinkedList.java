package ar.com.old.lists;

public class DoubleLinkedList<T> {
    private DoubleLinkedList<T> head;
    private DoubleLinkedList<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }







    public DoubleLinkedList<T> getHead() {
        return head;
    }

    public void setHead(DoubleLinkedList<T> head) {
        this.head = head;
    }

    public DoubleLinkedList<T> getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedList<T> tail) {
        this.tail = tail;
    }
}
