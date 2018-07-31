package com.bobocode;

class QueueNode<T> {

    T data;
    QueueNode<T> nexNode;

    QueueNode(T data) {
        this.data = data;
        this.nexNode = null;
    }
}
