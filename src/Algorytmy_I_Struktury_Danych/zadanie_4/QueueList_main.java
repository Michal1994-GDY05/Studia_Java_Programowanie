package Algorytmy_I_Struktury_Danych.zadanie_4;

public class QueueList_main {

    public static void main(String[] args) {
        InitQueue_List queue = new InitQueue_List();

        queue.enQueue("2");
        queue.enQueue("Napis");
        queue.enQueue("DUZEmale666");

        System.out.println(queue.searchElement("3"));

        System.out.println("Element na początku kolejki: " + queue.front());

        System.out.println("Kolejka przed usunięciem:");
        queue.printQueue();

        String removedElement = queue.deQueue();
        System.out.println("Usunięty element: " + removedElement);

        System.out.println("Kolejka po usunięciu:");
        queue.printQueue();
    }

}
