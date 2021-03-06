package br.com.trmasolucoes.logica;

import java.util.Scanner;

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


        /** Compare Operators*/
        System.out.println(x == 6); //Equal
        System.out.println(x != 6); // Difference
        System.out.println(x > 6);  // Greater then
        System.out.println(x >= 6); // Great or Equal than
        System.out.println(x < 6);  // Less then
        System.out.println(x <= 6); // Less or Equal than

        Integer w = 6;
        System.out.println(w instanceof Integer); // the variable w is a instance of class Integer
        System.out.println("PI" instanceof String); // the string "PI" is a instance of class String

        /** Logical Operators*/
        System.out.println((x >= 1) && (x <= 10)); //The operator AND returns  true if the two expressions is true
        System.out.println((x >= 1) || (x <= 10)); //The operator OR returns  true if the one expression is true
        System.out.println(!(x > 1)); // does the value of exprenssion be negative

        /** Assignment operators*/
        x += 3; // +=
        x -= 3; // -=
        x *= 3; // *=
        x /= 3; // /=
        x %= 3; // %=

        System.out.println(x);

        /** Specials Operators*/
        String idade = (27 > 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(idade);

        Scanner s = new Scanner(System.in);
        System.out.println("Type a value to the ray: \n");

        //Diameter
        double ray = s.nextDouble();
        double pi = Math.PI;
        double diameter = 2 * ray;
        System.out.println("Diameter: " + diameter);

        //Circunference
        double circ = 2 * pi * ray;
        System.out.println("Circunference: " + circ);

        //Area
        double area = pi * (ray * ray);
        System.out.println("Area: " + area);
    }
}
