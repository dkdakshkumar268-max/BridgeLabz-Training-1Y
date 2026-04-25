package com.gla.collections;

class CircularBuffer {
    private int[] buffer;
    private int capacity;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public void insert(int value) {
        if (size == capacity) {
            front = (front + 1) % capacity;
        } else {
            size++;
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
public class CircularBufferSimulation{
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); 
        cb.display();
    }
}
