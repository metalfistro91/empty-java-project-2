package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        System.out.println("escribe un numero");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

            // forma 1 //

            if (valor % 2 == 0) {
                System.out.println("el numero es par");
            } else {
                System.out.println("el numero es impar");
            }

        // forma 2 //

            int result = valor % 2;
            if (result != 0) {
                System.out.print("el numero es impar");
            } else {
                System.out.print("el numero es par");
            }

    }
}
