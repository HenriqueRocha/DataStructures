package net.henriquerocha.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntBinTreeTest {

    @Test
    public void traversesInPreorder() {
        IntBinTree binTree =
                new IntBinTree(3,
                        new IntBinTree(5, new IntBinTree(1), new IntBinTree(4)),
                        new IntBinTree(2, new IntBinTree(6), null));

        assertEquals("3->5->1->4->2->6->NULL", binTree.preOrderTraversal().toString());
    }
}
