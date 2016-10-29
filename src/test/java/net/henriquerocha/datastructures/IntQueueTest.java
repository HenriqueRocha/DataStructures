package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntQueueTest {

    @Test
    public void enqueueShouldMakeQueueNotEmpty() {
        IntQueue queue = new IntLinkedList();

        queue.enqueue(1);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void dequeueOnlyItemShouldMakeTheQueueEmpty() {
        IntQueue queue = new IntLinkedList();
        queue.enqueue(1);

        queue.dequeue();

        assertTrue(queue.isEmpty());
    }

    @Test
    public void dequeueAfterEnqueueShouldReturnEnqueuedElement() {
        IntQueue queue = new IntLinkedList();
        queue.enqueue(1);

        assertEquals(1, queue.dequeue());
    }

    @Test
    public void shouldEnqueueAllElements() {
        IntQueue queue = new IntLinkedList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals("1->2->3->NULL", queue.toString());
    }
}
