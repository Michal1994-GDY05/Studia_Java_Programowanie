package Algorytmy_I_Struktury_Danych.zadanie_2;

public class InitStack_Array {
    private int[] stackArray;
    private int top;
    protected int capacity;

    public InitStack_Array(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stos jest pełny. Nie można dodać więcej elementów.");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stos jest pusty.");
            return -1;
        }
        return stackArray[top--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stos jest pusty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void mergeSortedStacks(InitStack_Array stackA, InitStack_Array stackB) {
        InitStack_Array tempStack = new InitStack_Array(stackA.capacity + stackB.capacity);

        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            if (stackA.top() < stackB.top()) {
                tempStack.push(stackA.pop());
            } else {
                tempStack.push(stackB.pop());
            }
        }

        while (!stackA.isEmpty()) {
            tempStack.push(stackA.pop());
        }

        while (!stackB.isEmpty()) {
            tempStack.push(stackB.pop());
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
