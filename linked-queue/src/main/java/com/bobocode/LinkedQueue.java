package com.bobocode;

/**
 * This queue should be implemented using generic liked nodes. E.g. class Node<T>
 *
 * @param <T> a generic parameter
 */
public class LinkedQueue<T> implements Queue<T> {

    private QueueNode<T> start;
    private QueueNode<T> end;
    private int count;

    public LinkedQueue() {
        this.start = null;
        this.end = null;
        count = 0;
    }

    @Override
    public void add(T element) {
        QueueNode<T> node = new QueueNode<>(element);
        if (isEmpty()) {
            start = node;
            end = start;
            count++;
        } else {
            QueueNode<T> current = start;
            while (current.nexNode != null) {
                current = current.nexNode;
            }
            current.nexNode = node;
            current = current.nexNode;
            end = current;
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
            if (start.nexNode == null) {
                start = null;
                count--;
                return tempFirst.data;
            } else {
                QueueNode<T> tempThird;
                tempThird = start.nexNode.nexNode;
                start = start.nexNode;
                start.nexNode = tempThird;
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
