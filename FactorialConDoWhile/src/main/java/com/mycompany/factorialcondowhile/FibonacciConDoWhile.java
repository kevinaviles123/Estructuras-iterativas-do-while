package com.mycompany.factorialcondowhile;

public class FibonacciConDoWhile {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print("Serie de Fibonacci: " + a + " " + b);

        int contador = 2;
        do {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
            contador++;
        } while (contador < n);
    }
}

