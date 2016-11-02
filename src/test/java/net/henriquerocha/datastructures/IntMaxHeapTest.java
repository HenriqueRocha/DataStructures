package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntMaxHeapTest {
    @Test
    public void addShouldInsertIntoHeap() {
        IntMaxHeap heap = new IntMaxHeap();

        heap.add(1);

        assertEquals(1, heap.peek());
    }

    @Test
    public void addingTwoElementsShouldMaintainHeap() {
        IntMaxHeap heap = new IntMaxHeap();
        heap.add(1);
        heap.add(2);

        assertEquals(2, heap.peek());
    }

    @Test
    public void twoElementsShouldMaintainHeap() {
        IntMaxHeap heap = new IntMaxHeap();
        heap.add(1);
        heap.add(2);

        heap.remove();

        assertEquals(1, heap.peek());
    }

    @Test
    public void addAndRemoveShouldMaintainHeap() {
        IntMaxHeap heap = new IntMaxHeap();
        heap.addAll(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);

        IntLinkedList list = new IntLinkedList();
        while (!heap.isEmpty()) {
            int max = heap.peek();
            list.addFirst(max);
            heap.remove();
        }

        assertEquals("1->2->3->4->5->6->7->8->9->10->NULL", list.toString());
    }
}
