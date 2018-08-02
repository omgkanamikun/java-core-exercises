package com.bobocode;

/**
 * This queue should be implemented using generic liked nodes. E.g. class Node<T>
 *
 * @param <T> a generic parameter
 */
public class LinkedQueue<T> implements Queue<T> {

    private QueueNode<T> start;
    private int count;

    public LinkedQueue() {
        this.start = null;
        count = 0;
    }

    @Override
    public void add(T element) {
        QueueNode<T> node = new QueueNode<>(element);
        if (isEmpty()) {
            start = node;
            count++;
        } else {
            QueueNode<T> current = start;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = node;
            count++;
        }
    }

    @Override
    public T pull() {
        if (isEmpty()) {
            return null;
        } else {
            QueueNode<T> tempFirst;
            tempFirst = start;
            if (start.nextNode == null) {
                start = null;
                count--;
                return tempFirst.data;
            } else {
                QueueNode<T> tempNext;
                tempNext = start.nextNode.nextNode;
                start = start.nextNode;
                start.nextNode = tempNext;
                count--;
                return tempFirst.data;
            }
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }
}
