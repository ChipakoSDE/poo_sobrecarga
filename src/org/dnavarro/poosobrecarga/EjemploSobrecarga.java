package org.dnavarro.poosobrecarga;
import static org.dnavarro.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar enteros: " + sumar(10,5));
        System.out.println("Sumar float: " + sumar(10.0f,5f));
        System.out.println("Sumar float e int: " + sumar(10f,5));
        System.out.println("Sumar int y float: " + sumar(10,5.0f));
        System.out.println("Sumar double: " + sumar(10d, 5d));
        System.out.println("Sumar String: " + sumar("10","5"));
        System.out.println("Sumar 3 enteros: " + sumar(10,5,8));
        System.out.println("Sumar 5 enteros: " + sumar(10,5,8,12,38));
        System.out.println("Sumar float + n int: " + sumar(10.5f,5,8,12,38));

        System.out.println("Sumar long: " + sumar(10l, 5l));
        System.out.println("Sumar int: " + sumar(10,'@'));

    }
}
