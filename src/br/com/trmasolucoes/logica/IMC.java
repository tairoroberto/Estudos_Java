package br.com.trmasolucoes.logica;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by tairo
 * Date: 03/01/16.
 * Time: 20:27
 * OBS: Class to calculate corporea mass indice
 */
public class IMC {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Type your weight"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Type your height"));

        double imc = weight / (height * height);

        if (imc < 20){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are bellow of ideal weight!");
        } else if(imc > 20 && imc < 25){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are with the ideal weight!");
        }else if(imc > 25 && imc < 30){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are above of ideal weight!");
        }else if(imc > 30 && imc < 35){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are with moderated obesity!");
        }else if(imc > 35 && imc < 40){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are with severe obesity!");
        }else if(imc > 40 && imc < 50){
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are with morbid obesity!");
        }else {
            JOptionPane.showMessageDialog(null,"IMC: " + imc + "\n You are with SUPER OBESITY!");
        }
    }
}
