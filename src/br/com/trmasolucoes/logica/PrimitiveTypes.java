package br.com.trmasolucoes.logica;

/**
 * Created by tairo on 02/01/16.
 *
 * primitive types in java
 */
public class PrimitiveTypes {

    public static void main(String[] args) {

        int idade = 27;
        char sexo = 'M';
        double salario = 15000.00; // em breve :)
        boolean programador = true;

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l =  9223372036854775807L;
        float f = 10.0f;
        double d = 1.7976931348623157E+308D; //IEEE 754

        //binary form
        //put 0b in start of value
        byte bb = 0b01010101;// 8-bit or 1-byte
        short ss = 0b0101010101010101; //16-bit or 2-byte
        int ii = 0b01010101010101010101010101010101;// 32-bit or 4-byte


        /*Implicit Cast*/
         i = s;
        System.out.println("Value of 'i' in Implicit Cast - short to int: " + i);

        /*Explicit Cast */

        i = (int) l;
        System.out.println("Value of 'i' in Explicit Cast - long to int: " + i);



        //show values
        System.out.println("Value: " + ii);
    }
}
