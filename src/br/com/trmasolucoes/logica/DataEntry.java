package br.com.trmasolucoes.logica;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by tairo on 03/01/16.
 *
 * Data entry with Scanner in Java
 */
public class DataEntry {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Type your name:\n");
        String nome = s.nextLine();
        System.out.println("Hello " + nome);

        // Data entry with graphical window
        nome = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello more one time: " + nome);
        JOptionPane.showMessageDialog(null,"Hello more one time " + nome);
    }
}
