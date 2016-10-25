package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntListsTest {
    @Test
    public void shouldReverseEmptyList() {
        IntLinkedList list = new IntLinkedList();
        assertEquals("NULL", IntLists.reverse(list).toString());
    }

    @Test
    public void shouldReverseNonEmptyList() {
        IntLinkedList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals("3->2->1->NULL", IntLists.reverse(list).toString());
    }
}
