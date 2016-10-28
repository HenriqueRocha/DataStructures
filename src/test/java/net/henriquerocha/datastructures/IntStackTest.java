package net.henriquerocha.datastructures;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class IntStackTest {
    @Test
    public void pushMakesStackNotEmpty() {
        IntStack stack = new IntLinkedList();

        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushPushesToTop() {
        IntStack stack = new IntLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
    }

    @Test
    public void popRemovesTheTop() {
        IntStack stack = new IntLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int i = stack.pop();

        assertEquals(3, i);
        assertEquals(2, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void popFromEmptyThrowsException() {
        IntStack stack = new IntLinkedList();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekFromEmptyThrowsException() {
        IntStack stack = new IntLinkedList();
        stack.peek();
    }
}
