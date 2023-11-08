package Algorytmy_I_Struktury_Danych.zadanie_3;

public class QueueArray_main {

    public static void main(String[] args) {
        InitQueue_Array queue = new InitQueue_Array(3);

        queue.enQueue(10.1);
        queue.enQueue(10.3);
        queue.enQueue(10.4);

        queue.isFull();
        System.out.println(queue.isFull());

        queue.printQueue();

        System.out.println(queue.front());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
        System.out.println(queue.isEmpty());

        System.out.println(queue.front());

    }

}
