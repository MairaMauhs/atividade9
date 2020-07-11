/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Atividade9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um algoritmo que leia  10 valores inteiros
        //Durante a entrada de dados, conte quantos valores 
        //positivos existem. Ao término mostre o resultado.
        
        int ValoresPo, x , cont;
        
        cont = 1;
        ValoresPo = 0;
        
        
        while(cont <= 10){
            cont++;
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira qualquer número: "));
            
            if(x >=0){
                ValoresPo++;
            }
                
      }
        
        JOptionPane.showMessageDialog(null , "O Total de valores positivos inseridos foi de: "+ValoresPo);
        
    }
    
}
