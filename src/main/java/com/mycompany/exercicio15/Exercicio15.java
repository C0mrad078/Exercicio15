/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio15;
/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class Exercicio15 {

    public static void main(String[] args) {
        int idade;
        String nome; 
            nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));   
        if((idade > 15) && (idade < 25))
            {JOptionPane.showMessageDialog(null,nome + " Aceita");}
            else
            {JOptionPane.showMessageDialog(null,nome + " Nao Aceita");}
}
}