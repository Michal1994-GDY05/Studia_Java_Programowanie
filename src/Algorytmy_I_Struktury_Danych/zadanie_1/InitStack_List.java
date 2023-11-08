package Algorytmy_I_Struktury_Danych.zadanie_1;

import java.util.LinkedList;

public class InitStack_List {

    private LinkedList<Integer> stackList = new LinkedList<>();
    public void push(int element) {
        stackList.addLast(element);
    }

    public void peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stos jest pusty");
        }

        System.out.println(stackList.peekLast());
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stos jest pusty");
        }
        return stackList.removeLast();
    }

    public void reverseStack() {
        LinkedList<Integer> reversedStack = new LinkedList<>();

        while (!stackList.isEmpty()) {
            reversedStack.push(stackList.pop());
        }

        stackList = reversedStack;
    }

    public void printStack() {
        for (Integer integer : stackList) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }

}
