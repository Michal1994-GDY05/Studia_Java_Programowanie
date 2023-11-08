package Algorytmy_I_Struktury_Danych.zadanie_4;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue_List {

    private Queue<String> queue;


    public InitQueue_List() {
        queue = new LinkedList<>();
    }

    public boolean enQueue(String element){
        return queue.add(element);
    }

    public String deQueue(){
        if(empty()){
            throw new IllegalStateException("Kolejka jest pusta");
        }
        return queue.poll();
    }

    public String front(){
        return queue.element();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public void printQueue(){
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public String searchElement(String element){
        if(empty()){
            throw new IllegalStateException("Kolejka jest pusta, nie mozna nic wyszukac");
        }

        else if (queue.contains(element)){
            return "Kolejka zawiera element: " + element;
        }

        return "Brak elementu " + element;
    }
}

