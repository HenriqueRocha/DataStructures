package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntBstTest {

    @Test
    public void newTreeIsEmpty() {
        IntBST bst = new IntBST();

        assertTrue(bst.isEmpty());
    }

    @Test
    public void addMakesTreeNotEmpty() {
        IntBST bst = new IntBST();

        bst.add(1);

        assertFalse(bst.isEmpty());
    }

    @Test
    public void treeContainsAddedNumber() {
        IntBST bst = new IntBST();

        bst.add(1);

        assertTrue(bst.contains(1));
    }

    @Test
    public void addMultipleNumbersMakesTreeContainAll() {
        IntBST bst = new IntBST();

        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);

        assertTrue(bst.contains(1));
        assertTrue(bst.contains(2));
        assertTrue(bst.contains(3));
        assertTrue(bst.contains(4));
    }
}
