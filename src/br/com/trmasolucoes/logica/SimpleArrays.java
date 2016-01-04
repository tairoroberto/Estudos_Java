package br.com.trmasolucoes.logica;

import java.util.Arrays;

/**
 * Created by tairo
 * Date: 03/01/16.
 * Time: 21:43
 * OBS: Manipulating arrays with Java
 */
public class SimpleArrays {

    public static void main(String[] args){

        int[] odd = new int[5];
        odd[0] = 1;
        odd[1] = 2;
        odd[2] = 3;
        odd[3] = 4;
        odd[4] = 5;

        String[] countries = {"Brasil", "Rússia", "Índia", "China"};

        System.out.println("Country: " + countries[0]);
        System.out.println("Array length: "  + odd.length);

        /** Class to manipulate arrays*/
        System.out.println("SimpleArrays: " + Arrays.toString(odd));

        //Search a value in array
        System.out.println(Arrays.binarySearch(countries,"Rússia"));

        //Ordering array
        Arrays.sort(countries, 0, countries.length);
        System.out.println("Ordering Array: " + Arrays.toString(countries));

        //Accesing values in arrays
        Double[] values = {123.12, 321.21, 321.32};
        System.out.println("Double value: " + values[1].doubleValue());
    }
}
