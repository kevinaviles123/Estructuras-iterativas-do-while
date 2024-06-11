package com.mycompany.factorialcondowhile;

public class SumaConDoWhile {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;

        do {
            suma += contador;
            contador++;
        } while (contador <= 10);

        System.out.println("La suma de 1 a 10 es: " + suma);
    }
}

