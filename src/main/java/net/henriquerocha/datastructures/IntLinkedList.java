package net.henriquerocha.datastructures;

public class IntLinkedList {
    private Node head;
    private int size;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node n = head;
        while (n != null) {
            result.append(n.element).append("->");
            n = n.next;
        }
        result.append("NULL");
        return result.toString();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int e) {
        head = new Node(e, head);
        size++;
    }

    public void add(int e) {
        if (head == null) {
            head = new Node(e, null);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(e, null);
        }
        size++;
    }

    public void add(int index, int e) {
        if (index == 0) {
            head = new Node(e, head);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = new Node(e, n.next);
        }
        size++;
    }

    public int get(int index) {
        checkBounds(index);

        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.element;
    }

    private void checkBounds(int index) {
        if (head == null || index > size - 1) throw new IndexOutOfBoundsException();
    }

    /**
     * The size of the list in O(1) time.
     * New size is updated on every add or remove operation.
     *
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    public void clear() {
        head = null;
    }

    public void remove(int index) {
        checkBounds(index);

        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
        size--;
    }

    private class Node {
        int element;
        Node next;

        Node(int element, Node node) {
            this.element = element;
            this.next = node;
        }
    }
}
