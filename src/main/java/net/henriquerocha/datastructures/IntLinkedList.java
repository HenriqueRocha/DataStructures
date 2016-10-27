package net.henriquerocha.datastructures;

public class IntLinkedList {
    Node head;
    private int size;

    /**
     * The String representation of this linked list.
     * <p>
     * Inspired by HackerRank challenge:
     * <a href="https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list">
     * Print the Elements of a Linked List</a>
     * </p>
     *
     * @return <code>NULL</code> if the list is empty,
     * otherwise a list in the format <code>a1->...->an->NULL</code>
     */
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

    /**
     * Appends the specified element to the end of this list.
     * <p>
     * Inspired by HackerRank challenge:
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list">
     * Insert a Node at the Tail of a Linked List</a>
     * </p>
     *
     * @param e element to be appended to this list
     */
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

    /**
     * Inserts the specified element at the beginning of this list.
     * <p>
     * Inspired by HackerRank challenge:
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list>
     * Insert a node at the head of a linked list</a>
     * </p>
     *
     * @param e the element to add
     */
    public void addFirst(int e) {
        head = new Node(e, head);
        size++;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (adds one to their indices).
     * <p>
     * Inspired by HackerRank challenge:
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list">
     * Insert a node at a specific position in a linked list</a>
     * </p>
     *
     * @param index index at which the specified element is to be inserted
     * @param e     element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    public void add(int index, int e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(e);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = new Node(e, n.next);
        }
        size++;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * <p>
     * Inspired by HackerRank challenge:
     * <a href="https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list">Delete a Node</a>
     * </p>
     *
     * @param index the index of the element to be removed
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public void remove(int index) {
        checkValidElementIndex(index);

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

    private void checkValidElementIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Is this linked list empty?
     *
     * @return true if this linked list contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public int get(int index) {
        checkValidElementIndex(index);

        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.element;
    }

    /**
     * The number of elements in this list.
     * <p>
     * The size is computed in O(1) time. New size is updated on every add or remove operation.
     * </p>
     *
     * @return the number of elements in this list.
     */
    public int size() {
        return size;
    }

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    public void clear() {
        head = null;
    }

    /**
     * Reverse this linked list.
     */
    public void reverse() {
        Node reversed = null;
        Node n = head;
        while (n != null) {
            reversed = new Node(n.element, reversed);
            n = n.next;
        }
        head = reversed;
    }

    /**
     * Remove duplicates.
     *
     * O(n^2) time complexity.
     */
    public void removeDuplicates() {
        IntLinkedList found = new IntLinkedList();
        Node n = head;
        Node lastNonDup = n;
        while (n != null) {
            if (found.contains(n.element)) {
                lastNonDup.next = n.next;
            } else {
                found.addFirst(n.element);
                lastNonDup = n;
            }
            n = n.next;
        }
        lastNonDup.next = null;
    }

    public boolean contains(int i) {
        Node n = head;
        while (n != null) {
            if (n.element == i) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    class Node {
        int element;
        Node next;

        Node(int element, Node node) {
            this.element = element;
            this.next = node;
        }
    }
}
