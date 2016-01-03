package br.com.trmasolucoes.logica;

/**
 * Created by tairo on 02/01/16.
 *
 *Wrappers and static conversions
 */
public class Wrappers {
    public static void main(String[] args) {

        Integer idade = new Integer("27");
        Double preco = new Double("12.45");
        double p = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();

        System.out.println("Idade: " + idade);
        System.out.println("double value: " + p);
        System.out.println("int value: " + i);
        System.out.println("byte value: " + b);

        //STATIC CONVERSIONS
        double d = Double.parseDouble("13.55");
        int i1 = Integer.parseInt("123");
        float f = Float.parseFloat("123.34F");
        int i2 = Integer.valueOf("101011",2);

        System.out.println(i2);


    }
}
