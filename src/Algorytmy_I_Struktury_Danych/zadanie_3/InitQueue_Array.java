package Algorytmy_I_Struktury_Danych.zadanie_3;

public class InitQueue_Array {

    private double[] arrayQueue;
    private int first;
    private int last;
    private int size;
    private int capacity;

    public InitQueue_Array(int capacity) {
        this.capacity = capacity;
        arrayQueue = new double[capacity];
        first = 0;
        last = -1;
        size = 0;

    }

    public void enQueue(double element) {
        if (isFull()) {
            System.out.println("Kolejka jest pełna, nie mozna dodac elementu");
            return;
        }

        last = (last + 1) % capacity;
        arrayQueue[last] = element;
        size++;
    }

    public double deQueue() {
        if (isEmpty()) {
            System.out.println("Kolejka jest pusta, nie mozna usunac elementu");
            return -1;
        }

        double element = arrayQueue[first];
        first = (first + 1) % capacity;
        size--;
        return element;
    }

    public double front(){
        if(isEmpty()){
            System.out.println("Kolejka jest pusta, nie mozna pobrac elementu");
            return -1;
        }

        return arrayQueue[first];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printQueue() {
        int index = first;
        for (int i = 0; i < size; i++) {
            System.out.print(arrayQueue[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }
}
