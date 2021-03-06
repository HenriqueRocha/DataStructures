package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntLinkedListTest {
    @Test
    public void shouldPrintNullIfEmpty() {
        IntLinkedList list = new IntLinkedList();

        assertEquals("NULL", list.toString());
    }

    @Test
    public void shouldBeEmptyIfNew() {
        IntLinkedList list = new IntLinkedList();

        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldNotBeEmptyAfterAddingOneElement() {
        IntLinkedList list = new IntLinkedList();

        list.addFirst(1);

        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldPrintAllElements() {
        IntLinkedList list = new IntLinkedList();

        list.addFirst(1);

        assertEquals("1->NULL", list.toString());
    }

    @Test
    public void addAddsAtTheEnd() {
        IntLinkedList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        assertEquals("1->2->NULL", list.toString());
    }

    @Test
    public void addFirstAddsAtTheBeginning() {
        IntLinkedList list = new IntLinkedList();
        list.add(1);

        list.addFirst(2);

        assertEquals("2->1->NULL", list.toString());
    }

    @Test
    public void addIndexAddsAtTheCorrectPlace() {
        IntLinkedList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(2, 5);
        list.add(0, 0);

        assertEquals("0->1->2->5->3->NULL", list.toString());
    }

    @Test
    public void getIndexReturnsCorrectElement() {
        IntLinkedList list = new IntLinkedList();

        list.add(1, 2, 3);

        assertEquals(2, list.get(1));
    }

    @Test
    public void sizeReturns2ForListWithTwoElements() {
        IntLinkedList list = new IntLinkedList();

        list.add(1, 2, 3);

        assertEquals(3, list.size());
    }

    @Test
    public void clearMakesTheListEmpty() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);

        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    public void removeIndexRemovesFromBeginning() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);

        list.remove(0);

        assertEquals("2->3->NULL", list.toString());
    }

    @Test
    public void removeIndexRemovesFromEnd() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);

        list.remove(2);

        assertEquals("1->2->NULL", list.toString());
    }

    @Test
    public void removeIndexRemovesFromMiddle() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);

        list.remove(1);

        assertEquals("1->3->NULL", list.toString());
    }

    @Test
    public void shouldReverseEmptyList() {
        IntLinkedList list = new IntLinkedList();

        list.reverse();

        assertEquals("NULL", list.toString());
    }

    @Test
    public void shouldReverseNonEmptyList() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);

        list.reverse();

        assertEquals("3->2->1->NULL", list.toString());
    }

    @Test
    public void shouldRemoveDuplicates() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 1, 1, 3, 3, 5, 2);

        list.removeDuplicates();

        assertEquals("1->2->3->5->NULL", list.toString());
    }

    @Test
    public void containsReturnsFalseIfEmpty() {
        IntLinkedList list = new IntLinkedList();

        assertFalse(list.contains(1));
    }

    @Test
    public void containsReturnsTrueIfNumberIsThere() {
        IntLinkedList list = new IntLinkedList();

        list.add(1, 2, 3, 4);

        assertTrue(list.contains(3));
    }

    @Test
    public void addVarArgsAddsAllElements() {
        IntLinkedList list = new IntLinkedList();

        list.add(1, 2, 3, 4, 5);

        assertEquals("1->2->3->4->5->NULL", list.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOnEmptyListShouldThrowOutOfBounds() {
        IntLinkedList list = new IntLinkedList();
        list.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOutOfBoundsThrowsOutOfBounds() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);
        list.get(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeOutOfBoundsThrowsOutOfBounds() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 2, 3);
        list.remove(10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addOutOfBoundsThrowsOutOfBounds() {
        IntLinkedList list = new IntLinkedList();
        list.add(1, 10);
    }
}
