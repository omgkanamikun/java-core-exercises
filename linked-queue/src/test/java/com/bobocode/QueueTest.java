package com.bobocode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class QueueTest {

    private Queue<Integer> integerQueue = new LinkedQueue<>();

    @Test
    public void testAddElementIntoEmptyQueue() {
        integerQueue.add(1312);
    }

    @Test
    public void testPollElementFromEmptyQueue() {
        assertNull(integerQueue.pull());
    }

    @Test
    public void testSizeOfEmptyQueue() {
        assertEquals(0, integerQueue.size());
    }

    @Test
    public void testIsEmptyOnEmptyQueue() {
        assertTrue(integerQueue.isEmpty());
    }

    @Test
    public void testAddElement() {
        //fixed
        integerQueue.add(5);
        integerQueue.add(23);
        integerQueue.add(324);

        assertEquals(5, integerQueue.pull().intValue());
    }

    @Test
    public void testPullElement() {
        integerQueue.add(33);
        integerQueue.add(123);
        integerQueue.add(222);
        integerQueue.add(345);

        integerQueue.pull();

        assertEquals(123, integerQueue.pull().intValue());
        assertEquals(222, integerQueue.pull().intValue());
        assertEquals(345, integerQueue.pull().intValue());
    }

    @Test
    public void testSize() {
        integerQueue.add(98);
        integerQueue.add(9);
        integerQueue.add(5);
        integerQueue.add(6);
        integerQueue.add(99);

        assertEquals(5, integerQueue.size());
    }

    @Test
    public void testIsEmpty() {
        integerQueue.add(3);
        integerQueue.add(9);

        assertFalse(integerQueue.isEmpty());

        integerQueue.pull();
        integerQueue.pull();

        assertTrue(integerQueue.isEmpty());
    }

}
