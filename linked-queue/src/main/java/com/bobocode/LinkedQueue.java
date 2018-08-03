package com.bobocode;

/**
 * This queue should be implemented using generic liked nodes. E.g. class Node<T>
 *
 * @param <T> a generic parameter
 */
public class LinkedQueue<T> implements Queue<T> {

    private class Node<T> {
        T data;
        Node next;

        public Node(T element) {
            this.data = element;
            next = null;
        }
    }

    private int size;
    private Node<T> first;

    LinkedQueue() {
        first = null;
        size = 0;
    }

    @Override
    public void add(T element) {
        Node<T> node = new Node<>(element);
        if (isEmpty()) {
            first = node;
            size++;
        } else {
            Node<T> temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }

    @Override
    public T pull() {
        if (!isEmpty()) {
            T data = first.data;
            first = first.next;
            size--;
            return data;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
