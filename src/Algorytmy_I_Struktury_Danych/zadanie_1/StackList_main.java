package Algorytmy_I_Struktury_Danych.zadanie_1;

public class StackList_main {

    // 1. Zaimplementować stos liczb całkowitych przy realizacji listowej. Opracować algorytm, który
    // w oparciu o podstawowe operacje stosowe odwróci porządek elementów na stosie.

    public static void main(String[] args) {
        InitStack_List stackList = new InitStack_List();

        stackList.push(1);
        stackList.push(6);
        stackList.push(5);
        stackList.push(4);


        stackList.printStack();
        stackList.peek();

        stackList.reverseStack();
        stackList.printStack();
        stackList.peek();

        stackList.pop();
        stackList.peek();


    }
}
