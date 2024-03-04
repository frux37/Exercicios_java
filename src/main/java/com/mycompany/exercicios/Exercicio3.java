/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author carlos.aguirre
 */

import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int num1 = entrada.nextInt();
        
        System.out.println("Informe um numero que sera o decremento/incremento");
        int num_inc_dec = entrada.nextInt();
        
        int incremento = num1 + num_inc_dec;
        int decremento = num1 - num_inc_dec;
        
        System.out.println("Numero original: " + num1);
        System.out.println("Numero incrementado: " + incremento);
        System.out.println("Numero decrementado: " + decremento);
        
        entrada.close();
        
        System.out.println("Código versionado hahaha");
        System.out.println("Mais um commit hahahaha");
        System.out.println("Alteração no código do exercicio 3");
        System.out.print("olá mundo");
    }
    
}
