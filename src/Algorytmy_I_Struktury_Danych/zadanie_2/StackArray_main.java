package Algorytmy_I_Struktury_Danych.zadanie_2;

public class StackArray_main {

    public static void main(String[] args) {
        InitStack_Array stackA = new InitStack_Array(5);
        InitStack_Array stackB = new InitStack_Array(5);

        stackA.push(2);
        stackA.push(8);
        stackA.push(5);
        stackA.push(4);
        stackA.push(2);
        stackA.push(9);

        stackB.push(1);
        stackB.push(6);
        stackB.push(3);

        System.out.println(stackA.top());
        System.out.println(stackB.top());

        System.out.println("Stos A:");
        stackA.printStack();

        System.out.println("Stos B:");
        stackB.printStack();

        InitStack_Array stackC = new InitStack_Array(stackA.capacity + stackB.capacity);
        stackC.mergeSortedStacks(stackA, stackB);

        System.out.println("Stos C (po scaleniu):");
        stackC.printStack();
    }

}
