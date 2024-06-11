package com.mycompany.factorialcondowhile;

public class FactorialConDoWhile {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;
        int contador = 1;

        do {
            factorial *= contador;
            contador++;
        } while (contador <= numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

