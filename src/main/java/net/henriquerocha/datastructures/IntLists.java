package net.henriquerocha.datastructures;

public class IntLists {
    public static IntLinkedList reverse(IntLinkedList linkedList) {
        IntLinkedList reversedList = new IntLinkedList();
        IntLinkedList.Node n = linkedList.head;
        while (n != null) {
            reversedList.addFirst(n.element);
            n = n.next;
        }
        return reversedList;
    }
}
