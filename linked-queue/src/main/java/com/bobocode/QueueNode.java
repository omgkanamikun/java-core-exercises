package com.bobocode;

class QueueNode<T> {

    T data;
    QueueNode<T> nextNode;

    QueueNode(T data) {
        this.data = data;
    }
}
