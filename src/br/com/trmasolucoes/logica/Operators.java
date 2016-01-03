package br.com.trmasolucoes.logica;

/**
 * Created by tairo on 03/01/16.
 */
public class Operators {
    public static void main(String[] args) {

        // 2 + 3 // binary operator
        // -2 // unary operator
        // true ? "yes" : "no" // ternary operator

        int x = 9 + 4;
        System.out.println("Result: " + x);

        /** Mathematic Operators*/
        x = 2 + 3; // Sun
        x = 2 - 3; // Subtract
        x = 2 * 3; // Multiply
        x = 2 / 3; // Divide
        x = 4 % 2; // Module
        x = +4; // unary operator
        x = -4; // unary operator
        int y = 4;
        x = ++y; //pre-increment operator
        x = --y; //pre-decrement operator
        x = y++; //post-increment operator
        x = y--; //post-decrement operator



        System.out.println(x);
    }
}
